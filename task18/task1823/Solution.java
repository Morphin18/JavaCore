package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {

            while (true) {
                String fileName = reader.readLine();
                if (fileName.equals("exit")) { break;}
                ReadThread readThread = new ReadThread(fileName);
                readThread.start();
            }

        }catch (IOException e) {
            e.getStackTrace();
        }
    }

    public static class ReadThread extends Thread {
        private String fileName;
        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            int max = 0;
            Map<Integer,Integer> map = new HashMap<>();
            try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
                ArrayList<Integer> list = new ArrayList<>();
                while (fileInputStream.available() > 0) {
                          list.add(fileInputStream.read());
                }
                for (int i = 0; i < list.size(); i++) {
                    int count = Collections.frequency(list,list.get(i));
                    if (count > max) {
                        max = count;
                    }
                    map.put(list.get(i),count );
                }
                for (Map.Entry<Integer,Integer> pair : map.entrySet()) {
                    if (pair.getValue() == max) {
                        resultMap.put(this.fileName, pair.getKey());
                    }
                }
            }catch (IOException ignored) {}
        }
    }
}
