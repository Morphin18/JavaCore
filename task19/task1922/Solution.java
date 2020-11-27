package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("А");  //words.add("файл");
        words.add("Б"); //words.add("вид");
        words.add("В");//words.add("В");
    }

    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       BufferedReader bufferedReader = new BufferedReader(new FileReader(reader.readLine()));
       int count = 0;

       while (bufferedReader.ready()) {
           String[] line = bufferedReader.readLine().split(" ");
           for (String s : line) {
               for (String word : words) {
                   if (s.equals(word)) {
                       count++;
                   }
               }
           }
           if (count == 2) {
               for (String s : line) {
                   System.out.print(s + " ");
               }
               System.out.println();
           }
           count = 0;
       }
        bufferedReader.close();
        reader.close();

    }
}
