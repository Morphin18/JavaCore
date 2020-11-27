package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        BufferedReader bufferedReader = new BufferedReader(new FileReader(reader.readLine()));
        while (bufferedReader.ready()) {
          String string = bufferedReader.readLine().replaceAll("[^a-zA-Z ]", " ");
          String[] line = string.split(" ");
            for (int i = 0; i < line.length ; i++) {
               if (line[i].equals("world")) {
                   count++;
               }
            }
        }
        bufferedReader.close();
        reader.close();
        System.out.println(count);
    }
}
