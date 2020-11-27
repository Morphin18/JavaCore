package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class Solution {
    public static void main(String[] args) throws  Exception{
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        int countSymbol = 0, countSpace = 0;
        while ( fileInputStream.available() > 0 ) {
            countSymbol++;
            char ch = (char) fileInputStream.read();
            if ( Character.isSpaceChar(ch)) {
              countSpace++;
            }
        }
        fileInputStream.close();
        double result = (double)countSpace/countSymbol*100;
        System.out.format("%.2f",result);
    }
}
