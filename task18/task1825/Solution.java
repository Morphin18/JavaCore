package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        try {
            while (true) {
                String fileName = reader.readLine();
                if (fileName.equals("end")) {
                    break;
                }
                list.add(fileName);
            }
            Collections.sort(list);
            List<Byte> buffer = new ArrayList<>();
            for (String s : list) {
                try (BufferedReader bufferedReader = new BufferedReader(new FileReader(s))) {
                    while (bufferedReader.ready()) {
                        buffer.add((byte) bufferedReader.read());
                    }
                }
            }
            String str = list.get(0);
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(str.substring(0, str.lastIndexOf('.'))))) {
                for (byte aByte : buffer) {
                    bufferedWriter.write(aByte);
                }
            }
        }catch (IOException e)
        {
            e.getStackTrace();
        }
    }
}
