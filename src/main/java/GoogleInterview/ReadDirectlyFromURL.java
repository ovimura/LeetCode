package GoogleInterview;

import java.net.*;
import java.io.*;

public class ReadDirectlyFromURL {
    public void readFromURL(String url) throws Exception {
        URL web = new URL(url);
        BufferedReader in = new BufferedReader(new InputStreamReader(web.openStream()));
        String line;
        while((line = in.readLine()) != null) {
            System.out.println(line);
        }
        in.close();
    }
}
