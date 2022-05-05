//********************************************************************************
//*DovgaNik 2021-2022                                                            *
//*All files and this project are distributed under GNU Generel Public License V3*
//********************************************************************************

package jvesseltracker.jVesselParticulars;

import java.io.IOException;
import java.net.URL;
import jvesseltracker.webRequests.JDownload;

public class JPhoto {
    
    public static void get(String mmsi, String apikey, String agent) throws IOException{

            String url = "https://services.marinetraffic.com/api/exportvesselphoto/" + apikey + "/vessel_id:" + mmsi + "/protocol:json";

            System.out.println(url);

            jvesseltracker.webRequests.JWebRequests jWeb = new jvesseltracker.webRequests.JWebRequests(agent, url);
            String json = jWeb.sendGET();

            System.out.println(json);

            String temp = "";

            // <editor-fold defaultstate="collapsed" desc="deleting all unwanted characters in downloaded jason file">
            
                for (int i = 0; i < json.length(); i++) {
                    char charAt = json.charAt(i);
                    if (charAt != '[' & json.charAt(i) != ']' & json.charAt(i) != '"' & json.charAt(i) != '\\') {
                        temp += charAt;
                    }
                }
                
            // </editor-fold>

            System.out.println(temp);        

            JDownload.download(new URL(temp), "photo.jpg");

    }
    
}
