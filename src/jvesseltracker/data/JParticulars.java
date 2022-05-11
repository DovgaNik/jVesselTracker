//********************************************************************************
//*DovgaNik 2021-2022                                                            *
//*All files and this project are distributed under GNU Generel Public License V3*
//********************************************************************************

package jvesseltracker.data;

import java.io.IOException;
import java.net.URL;
import jvesseltracker.webRequests.JGet;

public class JParticulars {
    
    public static String 
                mmsi,
                imo,
                name,
                placeOfBuild,
                build,
                breadth,
                dwt,
                displacement,
                callsign,
                flag,
                draught,
                length,
                fuelConsumption,
                maxSpeed,
                serviceSpeed,
                oilCapacity,
                owner,
                manager,
                financialOwner,
                technicalManager,
                type;
    
    public static void get(URL url) throws IOException {

        String json = JGet.download(url);
        
        // <editor-fold defaultstate="collapsed" desc="Seleting all unwanted characters in downloaded JSON file">
            
                String temp = "";
                
                for (int i = 0; i < json.length(); i++) {
                    char charAt = json.charAt(i);
                    if (charAt != '[' & json.charAt(i) != ']' & json.charAt(i) != '"') {
                        temp += charAt;
                    }
                }
                
        // </editor-fold>
        
            String[] dataArr = temp.split(",");
            
            mmsi = dataArr[0];
            imo = dataArr[1];
            name = dataArr[2];
            placeOfBuild = dataArr[3];
            build = dataArr[4];
            breadth = dataArr[5];
            dwt = dataArr[6];
            displacement = dataArr[7];
            callsign = dataArr[8];
            flag = dataArr[9];
            draught = dataArr[10];
            length = dataArr[11];
            fuelConsumption = dataArr[12];
            maxSpeed = dataArr[13];
            serviceSpeed = dataArr[14];
            oilCapacity = dataArr[15];
            owner = dataArr[16];
            manager = dataArr[17];
            financialOwner = dataArr[18];
            technicalManager = dataArr[19];
            type = dataArr[20];
            
    }
            
}
