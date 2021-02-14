package jvesseltracker;

import java.io.IOException;

public class JVesselTracker {

	private static final String agent = "Mozilla/5.0";

	private static final String url = "https://services.marinetraffic.com/api/exportvessel/v:5/dbc7e47f9ead3b31f4602a1720d6219e489d27a8/timespan:100/mmsi:246896000/protocol:json";

	public static void main(String[] args) throws IOException, Exception {


		JWebRequests jWeb = new JWebRequests(agent, url);
	
		String json = jWeb.sendGET();
		System.out.println(json);
		

	}
	
	
	
}
