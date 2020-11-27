package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        String result = "";
        while (reader.ready()) {
            String[] line = reader.readLine().split(" ");
            for (int i = 0; i < line.length; i++) {
                if (line[i].length() > 6 ) {
                        result = result + line[i] + ",";
                }
            }
        }
        String finish = result.substring(0,result.length()-1);
        writer.write(finish);
        reader.close();
        writer.close();
    }
}
