package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try ( BufferedReader bufferedReader = new BufferedReader(new FileReader(reader.readLine()))){
          while (bufferedReader.ready()) {
              String line = bufferedReader.readLine();
              String id = line.substring(0,8).split(" ")[0];
              if (id.equals(args[0])) {
                  System.out.println(line);
              }
          }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
