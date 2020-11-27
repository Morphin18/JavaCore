package com.javarush.task.task19.task1920;

/* 
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        TreeMap<String, Double> map = new TreeMap<>();
       double max = 0;
        while (reader.ready()) {
            String line = reader.readLine();
            map.putIfAbsent(line.split(" ")[0], Double.valueOf(0));
            map.put(line.split(" ")[0], map.get(line.split(" ")[0]) + Double.parseDouble(line.split(" ")[1]));


        }

        for (Map.Entry<String, Double> pair : map.entrySet()) {
            if (max < pair.getValue()) {
                max = pair.getValue();
            }
        }
        reader.close();
        for (Map.Entry<String, Double> pair : map.entrySet()) {
            if (max == pair.getValue()) {
                System.out.println(pair.getKey());
            }
        }
    }
}
