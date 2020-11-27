package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
        BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));
        ArrayList<Integer> list = new ArrayList<>();
        try {
            while (reader.ready()) {
                list.add(Integer.parseInt(reader.readLine()));
            }
        }catch (NumberFormatException e)
        {
            reader.close();
            bufferedReader.close();
            fileInputStream.close();
        }finally {
            Collections.sort(list);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) % 2 == 0) {
                    System.out.println(list.get(i));
                }
            }
        }
        reader.close();
        bufferedReader.close();
        fileInputStream.close();

    }
}
