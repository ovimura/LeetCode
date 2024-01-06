package GoogleInterview;

import java.io.*;

public class ReadFile {
    public void read(String path) throws Exception {
        File file = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while((st = br.readLine()) != null) {
            System.out.println(st);
        }
    }

    public void write(String path) throws Exception {
        File file = new File(path);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        bufferedWriter.write("Hello world!");
        bufferedWriter.append(" me again :)");
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
