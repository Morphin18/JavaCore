package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        switch (args[0]) {
            case "-e": {
                FileInputStream fileInputStream = new FileInputStream(args[1]);
                FileOutputStream fileOutputStream = new FileOutputStream(args[2]);
                while (fileInputStream.available() > 0) {
                     fileOutputStream.write(~fileInputStream.read());
                }
                fileInputStream.close();
                fileOutputStream.close();
            }
            break;
            case "-d": {
                FileInputStream fileInputStream = new FileInputStream(args[1]);
                FileOutputStream fileOutputStream = new FileOutputStream(args[2]);
                while (fileInputStream.available() > 0) {
                    fileOutputStream.write(~fileInputStream.read());
                }
                fileInputStream.close();
                fileOutputStream.close();
            }
            break;
        }

    }

}
