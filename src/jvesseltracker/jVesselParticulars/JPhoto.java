//********************************************************************************
//*DovgaNik 2021-2022                                                            *
//*All files and this project are distributed under GNU Generel Public License V3*
//********************************************************************************

package jvesseltracker.jVesselParticulars;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javax.imageio.ImageIO;
import jvesseltracker.webRequests.JDownload;

public class JPhoto {
    
    public void get(String mmsi, String apikey, String agent) throws IOException{

            String url = "https://services.marinetraffic.com/api/exportvesselphoto/" + apikey + "/vessel_id:" + mmsi + "/protocol:json";

            System.out.println(url);

            File fileCheck = new File("cache/" + mmsi + "temp.jpg");
            
            if (!fileCheck.exists()){
            
                jvesseltracker.webRequests.JWebRequests jWeb = new jvesseltracker.webRequests.JWebRequests(agent, url);
                String json = jWeb.sendGET();

                System.out.println(json);

                String temp = "";

                // <editor-fold defaultstate="collapsed" desc="Deleting all unwanted characters in downloaded JSON file">

                    for (int i = 0; i < json.length(); i++) {
                        char charAt = json.charAt(i);
                        if (charAt != '[' & json.charAt(i) != ']' & json.charAt(i) != '"' & json.charAt(i) != '\\') {
                            temp += charAt;
                        }
                    }

                // </editor-fold>

                System.out.println(temp);        

                JDownload.download(new URL(temp), "cache/" + mmsi + "temp.jpg");

            }
            
    }
    
    public BufferedImage getBufferedImage(String mmsi, String apikey, String agent) throws IOException {
    
        get(mmsi, apikey, agent);
        return resizeImage(getImage("cache/" + mmsi + "temp.jpg"), 665, 420);
        
    }
    
    BufferedImage resizeImage(BufferedImage originalImage, int targetWidth, int targetHeight) throws IOException {
        
        Image resultingImage = originalImage.getScaledInstance(targetWidth, targetHeight, Image.SCALE_DEFAULT);
        BufferedImage outputImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_RGB);
        outputImage.getGraphics().drawImage(resultingImage, 0, 0, null);
        return outputImage;
        
    }
    
    private BufferedImage getImage(String filename) {
        
        try {
//            InputStream in = getClass().getResourceAsStream(filename);

            return ImageIO.read(new File(filename));
        } catch (IOException e) {
            System.out.println("The image was not loaded.");
        }

        return null;
        
    }
    
}
