package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int firstNumber = Integer.parseInt(reader.readLine());
        int secondNumber = Integer.parseInt(reader.readLine());
        if (firstNumber <= 0 || secondNumber <= 0) throw new NumberFormatException();
        int  maximum = Math.max(firstNumber, secondNumber);
        int result = 0;
        for (int i = 1; i < maximum; i++) {
            if ((firstNumber % i == 0) && (secondNumber % i == 0)) {
                result = i;
            }
        }
        System.out.println(result);

    }
}
