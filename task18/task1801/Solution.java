package com.javarush.task.task18.task1801;

/* 
Максимальный байт
*/


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        long max = 0;
        while (fileInputStream.available() > 0) {
            int i = fileInputStream.read();
            if (max < i) {
                max = i;
            }
        }
        System.out.println(max);
        reader.close();
        fileInputStream.close();
    }


}
