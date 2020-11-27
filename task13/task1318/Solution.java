package com.javarush.task.task13.task1318;

/* 
Чтение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        String name = reader.readLine();
        FileInputStream inputStream = new FileInputStream(name);
        while (inputStream.available() > 0)
        {
            int data = inputStream.read();
            System.out.print((char)data);
        }
        inputStream.close();
        reader.close();
    }
}