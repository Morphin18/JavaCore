package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        TreeMap<String, Double> map = new TreeMap<>();
        String name = " ";
        while (reader.ready()) {
            String line = reader.readLine();
            map.putIfAbsent(line.split(" ")[0], Double.valueOf(0));
            map.put(line.split(" ")[0], map.get(line.split(" ")[0]) + Double.parseDouble(line.split(" ")[1]));

        }
        for (Map.Entry<String, Double> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
        reader.close();


    }
}
