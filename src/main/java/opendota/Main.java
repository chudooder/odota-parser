package opendota;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length == 0 || args[0].isEmpty()) {
            System.err.println("No filepath specified!");
            return;
        }
        
        String filepath = args[0];
        
        File file = new File(filepath);
        if (file.exists()) {
            FileInputStream is = new FileInputStream(file);
            OutputStream os = System.out;
            try {
                new Parse(is, os);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
