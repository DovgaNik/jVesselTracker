//********************************************************************************
//*DovgaNik 2021-2022                                                            *
//*All files and this project are distributed under GNU Generel Public License V3*
//********************************************************************************

package jvesseltracker.webRequests;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class JGet {
    
    public static String download(URL url) throws IOException{
        
        InputStream inputStream;
        DataInputStream dataInputStream;
        String string;

        String returning = "";

        inputStream = url.openStream();
        dataInputStream = new DataInputStream(new BufferedInputStream(inputStream));
        while ((string = dataInputStream.readLine()) != null)
        returning += string;

        inputStream.close();

        return returning;

    }
    
}

