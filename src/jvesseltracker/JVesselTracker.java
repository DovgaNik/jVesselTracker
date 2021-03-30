package jvesseltracker;

import java.io.IOException;
import java.util.Scanner;

public class JVesselTracker {

	private static final String agent = "Mozilla/5.0";//User agent by default (recommended)

	private static final String apikey = "86a2ee2d5c2b22ae2c87320b7ddc4dd1697964ce";//apikey on marinetraffic
	private static final String mmsi = "246896000"; //mmsi
	private static byte timespan = 10; //timespan of the position
	
	private static String url = "https://services.marinetraffic.com/api/exportvessel/v:5/" + apikey + "/timespan:" + timespan + "/mmsi:" + mmsi + "/protocol:json";// Addres to the API of MarineTraffic

	public static void main(String[] args) throws IOException {
                
                
            Scanner in = new Scanner(System.in);
                
           url = "https://services.marinetraffic.com/api/exportvessel/v:5/" + apikey + "/timespan:" + in.nextInt() + "/mmsi:" + mmsi + "/protocol:json";// Addres to the API of MarineTraffic
            
		JWebRequests jWeb = new JWebRequests(agent, url);
	
		String json = jWeb.sendGET();
		System.out.println(json);
		
		System.out.println(json.length());
		
		if(json.length() == 3){
			System.out.println("Fuck");
		}else{
		
			parsedJson parser = new parsedJson(json);

			System.out.println("course " + parser.course);
			System.out.println("dataSource " + parser.dataSource);
			System.out.println("day " + parser.day);
			System.out.println("heading " + parser.heading);
			System.out.println("hour " + parser.hour);
			System.out.println("lat " + parser.lat);
			System.out.println("lon " + parser.lon);
			System.out.println("minute " + parser.minute);
			System.out.println("mmsi " + parser.mmsi);
			System.out.println("month " + parser.month);
			System.out.println("second " + parser.second);
			System.out.println("speed " + parser.speed);
			System.out.println("status " + parser.status);
			System.out.println("year " + parser.year);
			
		}
	}
	
}
