package com.javarush.task.task15.task1527;

/* 
Парсер реквестов
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args)throws  IOException{
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        String[] string = url.split("\\?");
        string = string[1].split("=");
        String[] str = string[1].split("&");
        String value = str[0];
        str[0] = string[0];
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }
        System.out.println();
        try {
            if (str[0].equals("obj")) {
                double number = Double.parseDouble(value);
                alert(number);
            }
        }catch (NumberFormatException e)
        {
            e.getStackTrace();
            alert(value);
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
