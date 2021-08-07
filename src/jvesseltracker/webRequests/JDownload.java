package jvesseltracker.webRequests;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class JDownload {
    
    public static void download(URL url, String fileName) throws IOException {
    
        try (BufferedInputStream in = new BufferedInputStream(url.openStream());
                
        FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
            byte dataBuffer[] = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
            }
        }
        
    }
    
}
