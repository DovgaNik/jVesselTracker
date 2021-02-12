package jvesseltracker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class JVesselTracker {

	private static final String USER_AGENT = "Mozilla/5.0";

	private static final String GET_URL = "https://services.marinetraffic.com/api/exportvessel/v:5/dbc7e47f9ead3b31f4602a1720d6219e489d27a8/timespan:100/mmsi:246896000";

	public static void main(String[] args) throws IOException {

		URL link = new URL(GET_URL);
		System.out.println(sendGET(link));
		
	}

	private static String sendGET(URL URL) throws IOException {
		
		HttpURLConnection con = (HttpURLConnection) URL.openConnection();
		con.setRequestMethod("GET");
		con.setRequestProperty("User-Agent", USER_AGENT);
		int responseCode = con.getResponseCode();
		System.out.println("GET Response Code :: " + responseCode);
		if (responseCode == HttpURLConnection.HTTP_OK) { // success
			BufferedReader in = new BufferedReader(new InputStreamReader(
					con.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}
			
			in.close();

			// print result
			return (response.toString());
		} else {
			return ("GET request not worked");
		}

	}
	
}
