package jvesseltracker.jSingleVesselPosition;

import jvesseltracker.JFrameError;

public class JSingleVesselPositionParsed {
    
	public String MMSI;
        public String name;   
        public String IMO;
        public float lat;
        public float lon;
        public byte speed;
        public int course;
        public int heading;
        public byte status;
        public int year;
        public byte month;
        public byte day;
        public byte hour;
        public byte minute;
        public byte second;
        public String dataSource;
	
	protected String // Creating variables, available only in this class and used for storing temporary information
		json, 
		temp = "", 
		dateTime[],
		date[], 
		time[];
	
	public JSingleVesselPositionParsed(String jsonToParse){ // Constructor of the class
		json = jsonToParse; // Writes variable, given by driver code to a protected variable
		
		parse(); //Calling parsing function
	}
	
	private void parse(){
            
            if (json != null){
            
		// <editor-fold defaultstate="collapsed" desc="deleting all unwanted characters in downloaded json file">
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
		
		MMSI = jsonInfo[0];
		lat = Float.valueOf(jsonInfo[1]);
		lon = Float.valueOf(jsonInfo[2]);
                int speedInteger = Integer.valueOf(jsonInfo[3]) / 10;
		speed = (byte) speedInteger;
		heading = Integer.parseInt(jsonInfo[4]);
		course = Integer.parseInt(jsonInfo[5]);
		status = Byte.valueOf(jsonInfo[6]);
		year = Integer.parseInt(date[0]);
		month = Byte.valueOf(date[1]);
		day = Byte.valueOf(date[2]);
		hour = Byte.valueOf(time[0]);
		minute = Byte.valueOf(time[1]);
		second = Byte.valueOf(time[2]);
		dataSource = jsonInfo[8];
            
            } else {
            
                JFrameError jFrameError = new JFrameError("API not working");
                jFrameError.setVisible(true);
            
            }
            
	}
}
