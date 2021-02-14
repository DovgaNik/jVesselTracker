package jvesseltracker;

import java.io.IOException;

public class JVesselTracker {

	private static final String agent = "Mozilla/5.0";

	private static final String url = "https://services.marinetraffic.com/api/exportvessel/v:5/dbc7e47f9ead3b31f4602a1720d6219e489d27a8/timespan:100/mmsi:246896000/protocol:json";

	public static void main(String[] args) throws IOException {


		JWebRequests jWeb = new JWebRequests(agent, url);
	
		String json = jWeb.sendGET();
		System.out.println(json);

		parsedJson parser = new parsedJson(json);
		
		System.out.println("course" + parser.course);
		System.out.println("dataSource" + parser.dataSource);
		System.out.println("day" + parser.day);
		System.out.println("heading" + parser.heading);
		System.out.println("hour" + parser.hour);
		System.out.println("lat" + parser.lat);
		System.out.println("lat" + parser.lon);
		System.out.println("minute" + parser.minute);
		System.out.println("mmsi" + parser.mmsi);
		System.out.println("month" + parser.month);
		System.out.println("second" + parser.second);
		System.out.println("speed" + parser.speed);
		System.out.println("status" + parser.status);
		System.out.println("year" + parser.year);
			
	}
	
}
