package jvesseltracker;

public class parsedJson {
	String 
		mmsi, 
		lat, 
		lon, 
		speed, 
		heading, 
		course, 
		status, 
		year, 
		month ,
		day , 
		hour,
		minute ,
		second, 
		dataSource;
	
	protected String 
		json, 
		temp = "", 
		dateTime[],
		date[], 
		time[];
	
	parsedJson(String jsonToParse){
		json = jsonToParse;
		
		parse();
	}
	
	private void parse(){
		for (int i = 0; i < json.length(); i++) {
			char charAt = json.charAt(i);
			if (charAt != '[' & json.charAt(i) != ']' & json.charAt(i) != '"') {
				temp += charAt;
			}
		}
		
		System.out.println(temp);
		
		String[] jsonInfo = temp.split(",");
		
		for (int i = 0; i < jsonInfo.length; i++) {
			System.out.println(i + ". " +jsonInfo[i]);
		}
		
		dateTime = jsonInfo[7].split("T");
		date = dateTime[0].split("-");
		time = dateTime[1].split(":");
		
		mmsi = jsonInfo[0];
		lat = jsonInfo[1];
		lon = jsonInfo[2];
		speed = jsonInfo[3];
		heading = jsonInfo[4];
		course = jsonInfo[5];
		status = jsonInfo[6];
		year = date[0];
		month = date[1];
		day = date[2];
		hour = time[0];
		minute = time[1];
		second = time[2];
		dataSource = jsonInfo[8];
	}
}
