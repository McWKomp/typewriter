package typewriterPack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor {
    public static String read(String name) throws IOException { //red,g,b
        BufferedReader br = new BufferedReader(new FileReader(name));
        String str = "";

        String line = br.readLine();
        while (line != null) {
            str+=line+"\n";

            line = br.readLine();
        }
        return str;
    }
}
