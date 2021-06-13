package jvesseltracker;

import jvesseltracker.jSingleVesselPosition.JPosition;
import java.io.IOException;
import java.util.Scanner;
import jvesseltracker.jVesselParticulars.JParticulars;

public class JVesselTracker {

	private static final String agent = "Mozilla/5.0";//User agent by default (recommended)

	private static final String apikey = "196b47649e313f2b0b2c71c3a04771ba4ca0c811";//apikey for single vessel position on marinetraffic
	private static final String mmsi = "353136000"; //mmsi
	
	//private static String url = "https://services.marinetraffic.com/api/exportvessel/v:5/" + apikey + "/timespan:" + timespan + "/mmsi:" + mmsi + "/protocol:json";// Addres to the API of MarineTraffic

	public static void main(String[] args) throws IOException {
            
            Scanner in = new Scanner(System.in);        
            
            JPosition.get(mmsi, 100, apikey, agent);
            
            JParticulars.get("9811000", "d32a46d8ab7bf29d86aaa02a405f403874981517", agent);
        }
}