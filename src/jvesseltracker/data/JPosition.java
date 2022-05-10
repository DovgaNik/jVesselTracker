//********************************************************************************
//*DovgaNik 2021-2022                                                            *
//*All files and this project are distributed under GNU Generel Public License V3*
//********************************************************************************

package jvesseltracker.data;

import java.io.IOException;

public class JPosition {
    
    public String get(String mmsi, int timespan, String apikey, String agent) throws IOException{
        
        String url = "https://services.marinetraffic.com/api/exportvessel/v:5/" + apikey + "/timespan:" + timespan + "/mmsi:" + mmsi + "/protocol:json";// Addres to the API of MarineTraffic
        jvesseltracker.webRequests.JWebRequests jWeb = new jvesseltracker.webRequests.JWebRequests(agent, url);
  
        System.out.println("Request URL for JPostition is " + url);
        
        String json = jWeb.sendGET();
        System.out.println(json);
		
        if (json != null){
        
            System.out.println(json.length());

            if(json.length() == 3){

                System.out.println("Fuck");
                return(null);

            }else{

                return(json);

            }
        
        }
        
        return null;
        
    }
    
}
