package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();
    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReader = new BufferedReader(new FileReader(reader.readLine()));
        while (bufferedReader.ready()) {
            String[] line = bufferedReader.readLine().split(" ");
            for (int i = 0; i < line.length; i++) {
                if (line[i].matches("[0-9]+")) {
                    int num = Integer.parseInt(String.valueOf(line[i]));
                    if (num <= 12) {
                        line[i] = map.get(num);
                    }
                }
            }
            for (int i = 0; i < line.length; i++) {
                System.out.print(line[i] + " ");
            }
            System.out.println();
        }
        reader.close();
        bufferedReader.close();
    }
}
