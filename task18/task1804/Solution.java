package com.javarush.task.task18.task1804;

/* 
Самые редкие байты
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        int count = 0;
        int min = 0;
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        while (fileInputStream.available() > 0) {
              list.add(fileInputStream.read());
        }
        reader.close();
        fileInputStream.close();
        for (int i = 0; i < list.size(); i++) {
            count = Collections.frequency(list,list.get(i));
            map.put(list.get(i), count);
        }
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
             min = pair.getValue();
             if (min < count) {
                 count = min;
             }
        }
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if (count == pair.getValue()) {
                System.out.print(pair.getKey() + " ");
            }
        }


    }
}
