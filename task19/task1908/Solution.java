package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader oneFile = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter secondFile = new BufferedWriter(new FileWriter(reader.readLine()));

        while (oneFile.ready()) {

            String[] line = oneFile.readLine().split(" ");
            for (int i = 0; i < line.length; i++) {

                if (line[i].matches("\\d+")) {
                    secondFile.write(line[i] + " ");
                }
            }


        }
        oneFile.close();
        secondFile.close();
        reader.close();

    }
}
