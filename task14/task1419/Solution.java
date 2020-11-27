package com.javarush.task.task14.task1419;

import java.io.*;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            Solution solution = new Solution();
            solution.clone();
        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            FileInputStream fileInputStream = new FileInputStream("F:\\");
        }catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            int[] array = new int[0];
            for (int i = 0; i < 10; i++) {
                array[i] = 2;
            }
        }catch (Exception e)
        {
            exceptions.add(e);
        }
        try {
           int i = Integer.parseInt("123j124");
        }catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            Object object = null;
            object.equals("adbc");
        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try {
             Object object[] = new String[10];
             object[0] = new Character('&');
        }catch (Exception e)
        {
            exceptions.add(e);
        }
        try {
            int[] array = new int[-5];
        }catch (Exception e)
        {
            exceptions.add(e);
        }
        try {
            String string = "123";
          char ch = string.charAt(10);
        }catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            FileWriter fileWriter = new FileWriter("C:\\Java\\sample.txt");
            fileWriter.close();
            fileWriter.write(123);
        }catch (Exception e)
        {
            exceptions.add(e);
        }

    }
}
