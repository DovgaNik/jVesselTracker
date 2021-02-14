package jvesseltracker;

import java.io.IOException;

public class JVesselTracker {

	private static final String agent = "Mozilla/5.0";

	private static final String url = "https://services.marinetraffic.com/api/exportvessel/v:5/dbc7e47f9ead3b31f4602a1720d6219e489d27a8/timespan:100/mmsi:246896000/protocol:json";

	public static void main(String[] args) throws IOException {


		JWebRequests jWeb = new JWebRequests(agent, url);
	
		String json = jWeb.sendGET();
		System.out.println(json);
		
		String parsed = "";
		
		for (int i = 0; i < json.length(); i++) {
			char charAt = json.charAt(i);
			if (charAt != '[' & json.charAt(i) != ']' & json.charAt(i) != '"') {
				parsed += charAt;
			}
		}
		
		System.out.println(parsed);
		
		String[] jsonInfo = parsed.split(",");
		
		for (int i = 0; i < jsonInfo.length; i++) {
			System.out.println(i + "	" +jsonInfo[i]);
		}
	}
	
	
	
}
