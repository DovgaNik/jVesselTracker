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
    public String description;
    
    
    void read(File file) throws FileNotFoundException, IOException {
        
        BufferedReader br = new BufferedReader(new FileReader(file));
                
        String string;
        String text = null;
        while ((string = br.readLine()) != null){
            text = text + string + "\n";
        }
        
        System.out.println(text);
        
        String[] splitFile = text.split("\n");
        
        for (int i = 0; i < splitFile.length; i++) {
            System.out.println(splitFile[i]);
        }
        
        if (splitFile.length == 14){
            System.out.println("good");
            MMSI = splitFile[1];
            name = splitFile[2];
            IMO = splitFile[3];
            speed = splitFile[4];
            course = splitFile[5];
            heading = splitFile[6];
            status = splitFile[7];
            year = splitFile[8];
            month = splitFile[9];
            day = splitFile[10];
            hour = splitFile[11];
            minute = splitFile[12];
            second = splitFile[13];
            description = splitFile[14];
        }else{
            System.out.println("Error: data file is damaged!!!");
        }
        
    }
    
}