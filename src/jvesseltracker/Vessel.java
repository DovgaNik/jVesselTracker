package jvesseltracker;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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
        while ((string = br.readLine()) != null)
            text = text + string + "\n";
                
        System.out.println(text);
        
        String[] splitFile = text.split("\n");
        
        for (int i = 0; i < splitFile.length; i++)
            System.out.println(splitFile[i]);
                
        if (splitFile.length == 16){
            System.out.println("good");
            MMSI = splitFile[1];
            name = splitFile[2];
            IMO = splitFile[3];
            lat = splitFile[4];
            lon = splitFile[5];
            speed = splitFile[6];
            course = splitFile[7];
            heading = splitFile[8];
            status = splitFile[9];
            year = splitFile[10];
            month = splitFile[11];
            day = splitFile[12];
            hour = splitFile[13];
            minute = splitFile[14];
            second = splitFile[15];
            dataSource = splitFile[16];
        }else
            System.out.println("Error: data file is damaged!!!");
                
    }
    
}