package jvesseltracker;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class JGet {
    
    public static String download(String url){
     
        URL u;
        InputStream is = null;
        DataInputStream dis;
        String s;
        
        String returning = "";

        try {
            
            u = new URL(url);
            is = u.openStream();
            dis = new DataInputStream(new BufferedInputStream(is));
            while ((s = dis.readLine()) != null)
                returning += s;
            
        }
        catch (MalformedURLException mue) {
            
            System.err.println("Ouch - a MalformedURLException happened.");
            mue.printStackTrace();
            
        }
        catch (IOException ioe) {
            
            System.err.println("Oops- an IOException happened.");
            ioe.printStackTrace();
            
        }
        finally {
            
          try {
            is.close();
          }
              
          catch (IOException ioe){}
          
        }
        
        return returning;
        
    }
    
}

