package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class Solution {
    public static void main(String[] args) throws  Exception{
        BufferedReader bufferedReader = new BufferedReader(new FileReader(args[0]));
        int count = 0, num;
        char[] abc = new char[]{'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m'};
        while ((num = bufferedReader.read()) != -1) {
            char ch = (char) num;

            for (int i = 0; i < abc.length; i++) {

                if (abc[i] == ch || Character.toUpperCase(abc[i]) == ch) {
                    count++;
                }
            }
        }
        bufferedReader.close();
        System.out.println(count);
    }
}
