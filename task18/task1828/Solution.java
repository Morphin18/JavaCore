package com.javarush.task.task18.task1828;

/* 
Прайсы 2
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        if (args.length > 0) {
            switch (args[0]) {
                case "-u":
                    updateTable(fileName, args);
                    break;
                case "-d":
                    deleteLineTable(fileName, args);
                    break;
            }
        } else System.exit(1);
    }

    public static void updateTable(String fileName, String[] args) throws Exception {
        //-u 19847 "Куртка замшевая" 159,00 12
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        ArrayList<String> list = new ArrayList<>();

        while (bufferedReader.ready()) {
            list.add(bufferedReader.readLine());
        }
        bufferedReader.close();
        if (args[1].length() > 8) {
            args[1] = args[1].substring(0, 8);
        } else if (args[2].length() > 30) {
            args[2] = args[2].substring(0, 30);
        } else if (args[3].length() > 8) {
            args[3] = args[3].substring(0, 8);
        } else if (args[4].length() > 4) {
            args[4] = args[3].substring(0, 4);
        }
        for (int i = 0; i < list.size(); i++) {
            int id = Integer.parseInt(list.get(i).substring(0, 8).split(" ")[0]);
            if (id == Integer.parseInt(args[1])) {
                list.set(i, String.format("%-8d%-30s%-8.2f%-4d", Integer.parseInt(args[1]), args[2],
                        Double.parseDouble(args[3]), Integer.parseInt(args[4])));
            }
        }
        PrintWriter writer = new PrintWriter(new FileWriter(fileName));
        for (String s : list) {
            writer.write(s);
            writer.write("\n");
        }
        writer.close();
    }

    public static void deleteLineTable(String fileName, String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        ArrayList<String> list = new ArrayList<>();
        while (bufferedReader.ready()) {
            list.add(bufferedReader.readLine());
        }
        bufferedReader.close();
        if (args[1].length() > 8) {
            args[1] = args[1].substring(0, 8);
        }

            for (int i = 0; i < list.size(); i++) {
                int id = Integer.parseInt(list.get(i).substring(0, 8).split(" ")[0]);
                if (id == Integer.parseInt(args[1])) {
                    list.remove(i);
                }
            }
            PrintWriter writer = new PrintWriter(new FileWriter(fileName));
            for (String s : list) {
                writer.write(s);
                writer.write("\n");
            }
            writer.close();
        }

}
