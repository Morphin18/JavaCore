package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(bufferedReader.readLine()));

        while (reader.ready()) {
            String line = reader.readLine();
            char[] ch = line.toCharArray();
            for (int i = ch.length-1; i >= 0; i--) {
                System.out.print(ch[i]);
            }
            System.out.println();
        }
        reader.close();
        bufferedReader.close();


    }
}
