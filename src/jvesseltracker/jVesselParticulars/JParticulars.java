package jvesseltracker.jVesselParticulars;

import java.io.IOException;
import java.net.URL;
import jvesseltracker.JDownload;
import jvesseltracker.JGet;
import jvesseltracker.JWebRequests;

public class JParticulars {
    
    public static void get(String mmsi, String apikey, String agent) throws IOException{
    
        String url = "https://services.marinetraffic.com/api/exportvesselphoto/" + apikey + "/vessel_id:" + mmsi + "/protocol:json";
        
        System.out.println(url);
        
        jvesseltracker.JWebRequests jWeb = new jvesseltracker.JWebRequests(agent, url);
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
        
        JDownload.download(new URL(temp), "123.jpg");
        
    }
            
}
