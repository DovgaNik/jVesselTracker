package jvesseltracker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class JWebRequests {

	static HttpURLConnection connection;
	String link;
	
	JWebRequests(final String userAgent, final String getPostURL) throws MalformedURLException, IOException{
		
		URL URL = new URL(getPostURL);
		link = getPostURL;
		connection = (HttpURLConnection) URL.openConnection();
		connection.setRequestProperty("User-Agent", userAgent);
		
	}

	public static String sendGET() throws IOException {
		connection.setRequestMethod("GET");
		int responseCode = connection.getResponseCode();
		System.out.println("GET Response Code :: " + responseCode);
		if (responseCode == HttpURLConnection.HTTP_OK) { // success
			BufferedReader in = new BufferedReader(new InputStreamReader(
					connection.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}

			// print result
			return response.toString();
		} else {
			System.out.println("GET request not worked");
			return null;
		}

	}

	private static void sendPOST(final String postParams) throws IOException {
		connection.setRequestMethod("POST");

		// For POST only - START
		connection.setDoOutput(true);
		OutputStream os = connection.getOutputStream();
		os.write(postParams.getBytes());
		os.flush();
		os.close();
		// For POST only - END

		int responseCode = connection.getResponseCode();
		System.out.println("POST Response Code :: " + responseCode);

		if (responseCode == HttpURLConnection.HTTP_OK) { //success
			BufferedReader in = new BufferedReader(new InputStreamReader(
					connection.getInputStream()));
			String inputLine;
			StringBuffer response = new StringBuffer();

			while ((inputLine = in.readLine()) != null) {
				response.append(inputLine);
			}

			// print result
			System.out.println(response.toString());
		} else {
			System.out.println("POST request not worked");
		}
	}

}