package com.javarush.task.task18.task1810;

/* 
DownloadException
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream;
        while (true) {
            fileInputStream = new FileInputStream(reader.readLine());
            if (fileInputStream.available() < 1000) {
                break;
            }
        }
        fileInputStream.close();
        reader.close();
        throw new DownloadException();

    }

    public static class DownloadException extends Exception {

    }
}
