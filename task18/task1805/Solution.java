package com.javarush.task.task18.task1805;

/* 
Сортировка байт
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
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        int count;

        while (fileInputStream.available() > 0) {
            list.add(fileInputStream.read());
        }
        reader.close();
        fileInputStream.close();

        for (int i = 0; i < list.size(); i++) {
            count = Collections.frequency(list,list.get(i));
            map.put(list.get(i),count);

        }
        list.clear();
        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            list.add(pair.getKey());
        }
        Collections.sort(list);
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
