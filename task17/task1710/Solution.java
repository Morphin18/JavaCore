package com.javarush.task.task17.task1710;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;


/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<>();

    static {

        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1

    }

    public static void main(String[] args) throws ParseException {

        switch (args[0]) {
                case "-c": create(args); break;
                case "-u": update(args); break;
                case "-d": delete(args); break;
                case "-i": print(args); break;
            }

    }
    public static void create(String[] args) throws ParseException {

        if (args[2].equals("м")) {
            allPeople.add(Person.createMale(args[1], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[3])));
            System.out.println(allPeople.size()-1);
        } else if (args[2].equals("ж")) {
            allPeople.add(Person.createFemale(args[1],new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[3])));
            System.out.println(allPeople.size()-1);
        }

    }
    public static void update(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d/MM/yyyy", Locale.ENGLISH);
        Date date = simpleDateFormat.parse(args[4]);
        int index = Integer.parseInt(args[1]);
        allPeople.get(index).setName(args[2]);
        if (args[3].equals("м")) { allPeople.get(index).setSex(Sex.MALE); }
        else allPeople.get(index).setSex(Sex.FEMALE);
        allPeople.get(index).setBirthDate(date);
    }
    public static void delete(String[] args) {
        int index = Integer.parseInt(args[1]);
        allPeople.get(index).setName(null);
        allPeople.get(index).setSex(null);
        allPeople.get(index).setBirthDate(null);
    }
    public static void print(String[] args) {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        int index = Integer.parseInt(args[1]);
        String string = String.valueOf(allPeople.get(index).getSex());
        System.out.print(allPeople.get(index).getName() + " ");
        if (string.equals("MALE")) {
            System.out.print("м");
        } else System.out.print("ж");
        System.out.print(" " + simpleDateFormat.format(allPeople.get(index).getBirthDate()));
    }
}
