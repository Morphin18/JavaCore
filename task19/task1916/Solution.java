package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedReaderFile = new BufferedReader(new FileReader(reader.readLine()));
        BufferedReader bufferedReaderFileS = new BufferedReader(new FileReader(reader.readLine()));
        ArrayList<String> listOne = new ArrayList<>();
        ArrayList<String> listSecond = new ArrayList<>();
        while (bufferedReaderFile.ready()) {
            listOne.add(bufferedReaderFile.readLine());
        }
        while (bufferedReaderFileS.ready()) {
            listSecond.add(bufferedReaderFileS.readLine());
        }
        reader.close();
        bufferedReaderFile.close();
        bufferedReaderFileS.close();

        while (listOne.size() > 1 || listSecond.size() >1){
            if (listOne.get(0).equals(listSecond.get(0))) {
                lines.add(new LineItem(Type.SAME,listOne.get(0)));
                listOne.remove(0);
                listSecond.remove(0);
            }else if (listOne.get(1).equals(listSecond.get(0))){
                lines.add(new LineItem(Type.REMOVED,listOne.get(0)));
                listOne.remove(0);
            }else if (listOne.get(0).equals(listSecond.get(1))){
                lines.add(new LineItem(Type.ADDED,listSecond.get(0)));
                listSecond.remove(0);
            }
        }
        if (listOne.size() == 0){ lines.add(new LineItem(Type.ADDED,listSecond.get(0)));}
        if (listSecond.size() == 0){ lines.add(new LineItem(Type.REMOVED,listOne.get(0)));}

        System.out.println();

    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
