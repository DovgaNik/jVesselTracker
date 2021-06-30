package jvesseltracker.jVesselParticulars;

import jvesseltracker.JGet;

public class JParticulars {
    
    public static void get(String url) {
    
        String 
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
        
        String json = JGet.download(url);
        
        // <editor-fold defaultstate="collapsed" desc="deleting all unwanted characters in downloaded jason file">
            
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
            
            System.out.println(mmsi);
            System.out.println(imo);
            System.out.println(name);
            System.out.println(placeOfBuild);
            System.out.println(build);
            System.out.println(breadth);
            System.out.println(dwt);
            System.out.println(displacement);
            System.out.println(callsign);
            System.out.println(flag);
            System.out.println(draught);
            System.out.println(length);
            System.out.println(fuelConsumption);
            System.out.println(maxSpeed);
            System.out.println(serviceSpeed);
            System.out.println(oilCapacity);
            System.out.println(owner);
            System.out.println(manager);
            System.out.println(financialOwner);
            System.out.println(technicalManager);
            System.out.println(type);
            
    }
            
}
