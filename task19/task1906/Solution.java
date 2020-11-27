package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileNameOne = reader.readLine();
        String fileNameSecond = reader.readLine();
        reader.close();
        FileReader fileReader = new FileReader(fileNameOne);
        FileWriter fileWriter = new FileWriter(fileNameSecond);
        int count = 1;
        while (fileReader.ready()) {
            int data = fileReader.read();
            if (count % 2 == 0) {
                fileWriter.write(data);
                count++;
            } else  count++;

        }
        fileReader.close();
        fileWriter.close();
    }
}
