package com.javarush.task.task13.task1319;

/* 
Писатель в файл с консоли
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file_name = reader.readLine();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file_name));
        String text = "";
        while (!text.equals("exit")) {
            text = reader.readLine();
            bufferedWriter.write(text + "\n");
        }
        reader.close();
        bufferedWriter.close();
    }
}
