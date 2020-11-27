package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream fileOutputStream = new FileOutputStream(reader.readLine());
        FileInputStream fileInputStreamSecond = new FileInputStream(reader.readLine());
        FileInputStream fileInputStreamThree = new FileInputStream(reader.readLine());

        while (fileInputStreamSecond.available() > 0) {
            fileOutputStream.write(fileInputStreamSecond.read());
        }
        fileInputStreamSecond.close();

        while (fileInputStreamThree.available() > 0) {
            fileOutputStream.write(fileInputStreamThree.read());
        }
        fileInputStreamThree.close();
        fileOutputStream.close();
        reader.close();

    }
}
