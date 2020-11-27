package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
      TreeMap<Character, Integer> map = new TreeMap<>();
        ArrayList<Character> list = new ArrayList<>();
       try ( BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
           while (reader.ready()) {
              list.add((char)reader.read());
           }
       }catch (IOException ignored) {}
        for (int i = 0; i < list.size(); i++) {
            int count = Collections.frequency(list,list.get(i));
            map.put(list.get(i), count);
        }

        for (Map.Entry<Character,Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

    }
}
