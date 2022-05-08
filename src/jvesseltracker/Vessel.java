//********************************************************************************
//*DovgaNik 2021-2022                                                            *
//*All files and this project are distributed under GNU Generel Public License V3*
//********************************************************************************

package jvesseltracker;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import jvesseltracker.jSingleVesselPosition.JPosition;
import jvesseltracker.jSingleVesselPosition.JSingleVesselPositionParsed;

public class Vessel {
    
    public BufferedImage photo;
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
    
    Boolean isEmpty;
    
    File fileLocal;
    String apiPS07Local;
    String apiVD01Local;
    
    Vessel(File file, String apiPS07, String apiVD01) throws IOException {
        
        read(file);
        fileLocal = file;
        
        apiPS07Local = apiPS07;
        apiVD01Local = apiVD01;
        
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
                lat = Float.valueOf(splitFile[3]);
                lon = Float.valueOf(splitFile[4]);
                speed = Byte.parseByte(splitFile[5]);
                course = Integer.parseInt(splitFile[6]);
                heading = Integer.parseInt(splitFile[7]);
                status = Byte.valueOf(splitFile[8]);
                year = Integer.parseInt(splitFile[9]);
                month = Byte.valueOf(splitFile[10]);
                day = Byte.valueOf(splitFile[11]);
                hour = Byte.valueOf(splitFile[12]);
                minute = Byte.valueOf(splitFile[13]);
                second = Byte.valueOf(splitFile[14]);
                dataSource = splitFile[15];
                
                isEmpty = false;
            }else
                System.out.println("Error: data file is damaged!!!");
            
            if (splitFile.length == 3) {
                System.out.println("good");
                MMSI = splitFile[0];
                name = splitFile[1];
                IMO = splitFile[2];
                
                isEmpty = false;
            }else
                System.out.println("Error: data file is damaged!!!");
        
        }else {
        
            isEmpty = true;
            
        }   
                       
    }
    
    void get(int timeStamp) throws IOException{
        
        if (apiPS07Local != null){
            
            JPosition download = new JPosition();
            JSingleVesselPositionParsed parsed = new JSingleVesselPositionParsed(download.get(MMSI, timeStamp, apiPS07Local, "Mozilla/5.0"));

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
      
            isEmpty = false;
            
        }else {
            
            System.out.println("no api");
            
        }
        
        if (apiVD01Local != null){
        
            jvesseltracker.jVesselParticulars.JPhoto jPhoto = new jvesseltracker.jVesselParticulars.JPhoto();
            photo = jPhoto.getBufferedImage(MMSI, apiVD01Local, "Mozilla/5.0");
            
        }
        
    }
    
    void setNew (String newMMSI, String newName, String newIMO) throws IOException{
        
        MMSI = newMMSI;
        name = newName;
        IMO = newIMO;
        
        isEmpty = false;
        
        get(1000);
        
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
        lat = 0;
        lon = 0;
        speed = 0;
        course = 0;
        heading = 0;
        status = 0;
        year = 0;        
        month = 0;        
        day = 0;
        hour = 0;
        minute = 0;
        second = 0;
        dataSource = null;
        
        isEmpty = true;
        
    }
    
}