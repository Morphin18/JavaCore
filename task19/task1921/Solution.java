package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        StringBuilder stringBuilder = new StringBuilder();
        String name = " ";
        String date = " ";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);
        while (reader.ready()) {
            String[] line = reader.readLine().split(" ");
            for (String s : line) {
                if (!s.matches("[-+]?\\d+")) {
                    name += s + " ";
                } else {
                    date += s + " ";
                }
            }
            Date birthDate = simpleDateFormat.parse(date);
            PEOPLE.add(new Person(name.trim(), birthDate));
            name = " ";
            date = " ";

        }
        reader.close();



    }
}
