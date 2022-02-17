package com.sapient.io.streams.chars;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterReaderAndWriter {
    public static void main(String[] args) throws IOException {
        String filename = "hello_copy.txt";
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader(filename);
            fileWriter = new FileWriter("newFile.txt", true);
            int data;
            while ((data = fileReader.read()) != -1) {
                //System.out.print((char) data);
                fileWriter.write(data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            //every file must be closed
            fileReader.close();
            fileWriter.close();
        }
    }
}
