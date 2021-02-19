package jvesseltracker;

public class parsedJson {
	String //Creating public string to store all parsed information
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
	
	protected String // Creating variables, available only in this class and used for storing temporary information
		json, 
		temp = "", 
		dateTime[],
		date[], 
		time[];
	
	parsedJson(String jsonToParse){ // Constructor of the class
		json = jsonToParse; // Writes variable, given by driver code to a protected variable
		
		parse(); //Calling parsing function
	}
	
	private void parse(){
		// <editor-fold defaultstate="collapsed" desc="deleting all unwanted characters in downloaded jason file">
		for (int i = 0; i < json.length(); i++) {
			char charAt = json.charAt(i);
			if (charAt != '[' & json.charAt(i) != ']' & json.charAt(i) != '"') {
				temp += charAt;
			}
		}
		// </editor-fold>
		
		System.out.println(temp); // Output of temporary string with deleted characters
		
		String[] jsonInfo = temp.split(","); // Splitting all parametres of the vessel
		
		for (int i = 0; i < jsonInfo.length; i++) {
			System.out.println(i + ". " +jsonInfo[i]);
		}
		
		dateTime = jsonInfo[7].split("T");// Parsing date and time to different indexes in an array
		date = dateTime[0].split("-");// Parsing date
		time = dateTime[1].split(":");// parsing time
		
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
