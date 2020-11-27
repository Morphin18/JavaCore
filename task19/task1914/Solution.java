package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()
                ;
        PrintStream stream = new PrintStream(byteArrayOutputStream);

        System.setOut(stream);

        testString.printSomething();

        String[] result = byteArrayOutputStream.toString().split(" ");

        switch (result[1]) {
            case "-": result[4] = String.valueOf((Integer.parseInt(result[0]) - Integer.parseInt(result[2]))); break;
            case "*": result[4] = String.valueOf((Integer.parseInt(result[0]) * Integer.parseInt(result[2]))); break;
            case "+": result[4] = String.valueOf((Integer.parseInt(result[0]) + Integer.parseInt(result[2]))); break;
        }

        System.setOut(consoleStream);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

