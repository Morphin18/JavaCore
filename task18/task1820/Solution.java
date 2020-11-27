package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(reader.readLine()));
             BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()))){
            String line = bufferedReader.readLine();
            String[] doubleNumber = line.split(" ");
            for (int i = 0; i < doubleNumber.length; i++) {
                writer.write(Math.round(Double.parseDouble(doubleNumber[i])) + " " );
            }
        }catch (IOException ignored) {}
    }
}
