package jvesseltracker;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
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
    
    File fileLocal;
    
    Vessel(File file) throws IOException {
        
        read(file);
        fileLocal = file;
        
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
            
            if (splitFile.length == 3) {
                System.out.println("good");
                MMSI = splitFile[0];
                name = splitFile[1];
                IMO = splitFile[2];
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
    
    void setNew (String newMMSI, String newName, String newIMO) throws IOException{
        
        MMSI = newMMSI;
        name = newName;
        IMO = newIMO;
        
        get(1000, "a7d4b34ff512484240984cc426ef7fe6e51f47c5");
        
    }
    
    void write () throws IOException{
        
        String file = MMSI + "\n" + name + "\n" + IMO + "\n" + lat + "\n" + lon + "\n" + speed + "\n" + course + "\n" + heading + "\n" + status + "\n" + year + "\n" + month + "\n" + day + "\n" + hour + "\n" + minute + "\n" + second + "\n" + dataSource;
        
        System.out.println("=== \n" + "start of file to be written \n" + file + "\n end" + "===");
        
        FileWriter fw = new FileWriter(fileLocal);
        fw.write(file);
        fw.close();
    }
    
    void clear(){
        
        MMSI = null;
        name = null;
        IMO = null;
        lat = null;
        lon = null;
        speed = null;
        course = null;
        heading = null;
        status = null;
        year = null;        
        month = null;        
        day = null;
        hour = null;
        minute = null;
        second = null;
        dataSource = null;
        
    }
    
}