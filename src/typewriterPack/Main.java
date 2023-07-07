package typewriterPack;

import java.io.*;

public class Main {
    public static void main(String[] args){
       UI ui = new UI();
        try {
            String text = FileProcessor.read("text.txt");
            ui.setLabel(text);
        } catch (IOException e) {
            System.out.println("file not found");
        }

    }



}




