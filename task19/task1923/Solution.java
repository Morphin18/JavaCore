package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        while (reader.ready()) {

            String[] line = reader.readLine().split(" ");
            for (int i = 0; i < line.length; i++) {
                char[] ch = line[i].toCharArray();
                for (int j = 0; j < ch.length; j++) {
                    if (Character.isDigit(ch[j])) {
                        writer.write(line[i]+ " ");
                        break;
                    }
                }
            }
        }
        reader.close();
        writer.close();
    }
}
