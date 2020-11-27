package com.javarush.task.task18.task1824;

/* 
Файлы и исключения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = null;
        BufferedReader bufferedReader = null;
        try {
            while(true)
            {
                fileName = reader.readLine();
                bufferedReader = new BufferedReader(new FileReader(fileName));
                bufferedReader.close();

            }
        }catch (FileNotFoundException file)
        {
            System.out.println(fileName);



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
