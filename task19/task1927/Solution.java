package com.javarush.task.task19.task1927;

/* 
Контекстная реклама
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream printStream = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(buffer);
        System.setOut(stream);

        testString.printSomething();

        String[] text = buffer.toString().split("\n");
        System.setOut(printStream);

        for (int i = 0; i < text.length; i++) {
            if ((i % 2 == 0) && i >= 2) {
                System.out.println("JavaRush - курсы Java онлайн");
                System.out.println(text[i]);
            } else {
                System.out.println(text[i]);
            }
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
