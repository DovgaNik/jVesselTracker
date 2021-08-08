package jvesseltracker.jSingleVesselPosition;

import java.io.IOException;

public class JPosition {
    
    public String get(String mmsi, int timespan, String apikey, String agent) throws IOException{
        
        String url = "https://services.marinetraffic.com/api/exportvessel/v:5/" + apikey + "/timespan:" + timespan + "/mmsi:" + mmsi + "/protocol:json";// Addres to the API of MarineTraffic
        jvesseltracker.webRequests.JWebRequests jWeb = new jvesseltracker.webRequests.JWebRequests(agent, url);
  
        System.out.println(url);
        
        String json = jWeb.sendGET();
        System.out.println(json);
		
        System.out.println(json.length());
		
        if(json.length() == 3){
            System.out.println("Fuck");
            return(null);
        }else{
		
//            JSingleVesselPositionParsed parser = new JSingleVesselPositionParsed(json);
//
//            System.out.println("course " + parser.course);
//            System.out.println("dataSource " + parser.dataSource);
//            System.out.println("day " + parser.day);
//            System.out.println("heading " + parser.heading);
//            System.out.println("hour " + parser.hour);
//            System.out.println("lat " + parser.lat);
//            System.out.println("lon " + parser.lon);
//            System.out.println("minute " + parser.minute);
//            System.out.println("mmsi " + parser.mmsi);
//            System.out.println("month " + parser.month);
//            System.out.println("second " + parser.second);
//            System.out.println("speed " + parser.speed);
//            System.out.println("status " + parser.status);
//            System.out.println("year " + parser.year);
		
            return(json);
	}
        
    }
    
}
