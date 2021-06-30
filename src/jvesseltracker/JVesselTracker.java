package jvesseltracker;

import jvesseltracker.jSingleVesselPosition.JPosition;
import java.io.IOException;
import java.util.Scanner;
import jvesseltracker.jVesselParticulars.JParticulars;
import jvesseltracker.jVesselParticulars.JPhoto;

public class JVesselTracker {

	private static final String agent = "Mozilla/5.0";//User agent by default (recommended)

	private static final String apikey = "66d817df5ba972bec458f47448d7c5bf2b9d3ed7";//apikey for single vessel position on marinetraffic
	private static final String mmsi = "353136000"; //mmsi
	
	//private static String url = "https://services.marinetraffic.com/api/exportvessel/v:5/" + apikey + "/timespan:" + timespan + "/mmsi:" + mmsi + "/protocol:json";// Addres to the API of MarineTraffic

	public static void main(String[] args) throws IOException {
            
            Scanner in = new Scanner(System.in);        
            
            JPosition.get(mmsi, 100, apikey, agent);
            
            JPhoto.get("9811000", "d32a46d8ab7bf29d86aaa02a405f403874981517", agent);
            
            JParticulars.get("https://services.marinetraffic.com/api/vesselmasterdata/v:4/39bff00eaad136c5ce1efeed437b61cd36b79f2b/mmsi:353136000/protocol:json");
        }
}