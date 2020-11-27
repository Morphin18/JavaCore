package com.javarush.task.task17.task1711;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException{
        switch (args[0]) {
            case "-c": synchronized (allPeople) { create(args); break; }
            case "-u": synchronized (allPeople) { update(args); break; }
            case "-d": synchronized (allPeople) { delete(args); break; }
            case "-i": synchronized (allPeople) { print(args); break; }
        }

    }

    public static void create(String[] args) throws ParseException {
        //-c Миронов м 15/04/1990 Миронова ж 15/04/1990
        for (int i = 1; i < args.length; i += 3) {
            if (args[i+1].equals("м")) {
                allPeople.add(Person.createMale(args[i], new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[i+2])));
            } else if (args[i+1].equals("ж")) {
                allPeople.add(Person.createFemale(args[i],new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(args[i+2])));
            }
            System.out.println(allPeople.size()-1);
        }

    }
    public static void update(String[] args) throws ParseException {
        //-u id1 name1 sex1 bd1 id2 name2 sex2 bd2
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d/MM/yyyy", Locale.ENGLISH);
        for (int i = 1; i < args.length; i += 4) {
            int index = Integer.parseInt(args[i]);
            Date date = simpleDateFormat.parse(args[i+3]);
            allPeople.get(index).setName(args[i+1]);
            if (args[i+2].equals("м")) {
                allPeople.get(index).setSex(Sex.MALE);
            } else allPeople.get(index).setSex(Sex.FEMALE);
            allPeople.get(index).setBirthDate(date);
        }
    }
    public static void delete(String[] args) {
        //-d id1 id2 id3 id4
        for (int i = 1; i < args.length; i++) {
            int index = Integer.parseInt(args[i]);
            allPeople.get(index).setName(null);
            allPeople.get(index).setSex(null);
            allPeople.get(index).setBirthDate(null);
        }

    }
    public static void print(String[] args) {
        //-i id1 id2 id3 id4
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        for (int i = 1; i < args.length; i++) {
            int index = Integer.parseInt(args[i]);
            String string = String.valueOf(allPeople.get(index).getSex());
            System.out.print(allPeople.get(index).getName() + " ");
            if (string.equals("MALE")) {
                System.out.print("м");
            } else System.out.print("ж");
            System.out.print(" " + simpleDateFormat.format(allPeople.get(index).getBirthDate()));
            System.out.println();
        }

    }
}
