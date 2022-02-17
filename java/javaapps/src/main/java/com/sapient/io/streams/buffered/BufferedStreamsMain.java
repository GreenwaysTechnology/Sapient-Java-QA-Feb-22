package com.sapient.io.streams.buffered;

import java.io.*;

public class BufferedStreamsMain {
    public static void main(String[] args) throws IOException {
        String filename = "hello_copy.txt";
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));

        try {
            fileWriter = new FileWriter("newFile.txt", true);
            int data;
            while ((data = bufferedReader.read()) != -1) {
                //System.out.print((char) data);
                fileWriter.write(data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            //every file must be closed
            bufferedReader.close();
            fileWriter.close();
        }
    }
}
