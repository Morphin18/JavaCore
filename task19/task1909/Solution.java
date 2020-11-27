package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader oneFile = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter secondFile = new BufferedWriter(new FileWriter(reader.readLine()));

        while (oneFile.ready()) {

            secondFile.write(oneFile.readLine().replaceAll("\\.", "!"));

        }
        oneFile.close();
        secondFile.close();
        reader.close();
    }
}
