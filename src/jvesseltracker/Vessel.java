package jvesseltracker;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import jvesseltracker.jSingleVesselPosition.JPosition;
import jvesseltracker.jSingleVesselPosition.JSingleVesselPositionParsed;

public class Vessel {
    
    public String MMSI;
    public String name;   
    public String IMO;
    public String lat;
    public String lon;
    public String speed;
    public String course;
    public String heading;
    public String status;
    public String year;
    public String month;
    public String day;
    public String hour;
    public String minute;
    public String second;
    public String dataSource;
    
    Vessel(File file) throws IOException {
        
        read(file);
        
    }
    
    void read(File file) throws FileNotFoundException, IOException {
        
        BufferedReader br = new BufferedReader(new FileReader(file));
                
        String string;
        String text = null;
        while ((string = br.readLine()) != null){
        
            if(text != null){
                text = text + string + "\n";
            }else{
                text = string + "\n";
            }
        }        
        System.out.println(text);
        
        if(text != null) {
            String[] splitFile = text.split("\n");
            
            for (int i = 0; i < splitFile.length; i++)
                System.out.println(splitFile[i]);
                
            if (splitFile.length == 16) {
                System.out.println("good");
                MMSI = splitFile[0];
                name = splitFile[1];
                IMO = splitFile[2];
                lat = splitFile[3];
                lon = splitFile[4];
                speed = splitFile[5];
                course = splitFile[6];
                heading = splitFile[7];
                status = splitFile[8];
                year = splitFile[9];
                month = splitFile[10];
                day = splitFile[11];
                hour = splitFile[12];
                minute = splitFile[13];
                second = splitFile[14];
                dataSource = splitFile[15];
            }else
                System.out.println("Error: data file is damaged!!!");
        
        }   
                       
    }
    
    void get(int timeStamp, String apikey) throws IOException{
        
        JPosition download = new JPosition();
        JSingleVesselPositionParsed parsed = new JSingleVesselPositionParsed(download.get(MMSI, timeStamp, apikey, "Mozilla/5.0"));

        lat = parsed.lat;
        lon = parsed.lon;
        speed = parsed.speed;
        course = parsed.course;
        heading = parsed.heading;
        status = parsed.status;
        year = parsed.year;
        month = parsed.month;
        day = parsed.day;
        hour = parsed.hour;
        minute = parsed.minute;
        second = parsed.second;
        dataSource = parsed.dataSource;
        
    }
    
}