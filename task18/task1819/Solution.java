package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception{
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String filNameOne = reader.readLine();
       String fileNameSecond = reader.readLine();
       reader.close();

       FileInputStream fileInputStream = new FileInputStream(filNameOne);
       byte[] bufferFileOne = new byte[fileInputStream.available()];
       fileInputStream.read(bufferFileOne);
       fileInputStream.close();
       FileOutputStream fileOutputStream = new FileOutputStream(filNameOne);
       FileInputStream fileInputStream1 = new FileInputStream(fileNameSecond);
       while (fileInputStream1.available() > 0) {
           fileOutputStream.write(fileInputStream1.read());
       }
       fileInputStream1.close();
       fileOutputStream.write(bufferFileOne);
       fileOutputStream.close();

    }
}
