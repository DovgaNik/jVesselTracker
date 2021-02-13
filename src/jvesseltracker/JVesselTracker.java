package jvesseltracker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class JVesselTracker {

	private static final String USER_AGENT = "Mozilla/5.0";

	private static final String GET_URL = "https://services.marinetraffic.com/api/exportvessel/v:5/dbc7e47f9ead3b31f4602a1720d6219e489d27a8/timespan:100/mmsi:246896000";

	public static void main(String[] args) throws IOException, Exception {


		JWebRequests jWeb = new JWebRequests(USER_AGENT, GET_URL);

		System.out.println(jWeb.sendGET());
		
	}
	
}
