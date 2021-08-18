package jvesseltracker;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Configuration {
    
    public String apiPS07, apiVD01;
    
    File configFileLocal;
    
    Configuration(File configFile) throws IOException {
    
        configFileLocal = configFile;
        read();
        
    }
        
    void read() throws FileNotFoundException, IOException {
    
        BufferedReader bufferedReader = new BufferedReader(new FileReader(configFileLocal));
                
        String string;
        String text = null;
        while ((string = bufferedReader.readLine()) != null){
        
            if(text != null){
                text = text + string + "\n";
            }else{
                text = string + "\n";
            }
        }        
        System.out.println(text);
        
        String[] textSplit = text.split("\n");
        
        System.out.println(textSplit.length);
        
        if(textSplit.length == 2){
        
            System.out.println("PS07" + textSplit[0]);
            apiPS07 = textSplit[0];

            System.out.println("VD01" + textSplit[1]);
            apiVD01 = textSplit[1];
        
        }
        
    }
    
    void write () throws IOException{
        
        String file = apiPS07 + "\n" + apiVD01;
        
        System.out.println("=== \n" + "start of file to be written \n" + file + "\n end" + "===");
        
        FileWriter fileWriter = new FileWriter(configFileLocal);
        fileWriter.write(file);
        fileWriter.close();
    }
    
}
