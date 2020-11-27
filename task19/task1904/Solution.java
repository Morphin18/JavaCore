package com.javarush.task.task19.task1904;

/* 
И еще один адаптер
*/


import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner scanner) {
            this.fileScanner = scanner;
        }

        @Override
        public Person read() throws IOException {
            //Иванов Иван Иванович 31 12 1950
            String[] pers = fileScanner.nextLine().split(" ");
            DateFormat dateFormat = new SimpleDateFormat("dd MM yyyy", Locale.ENGLISH);
            String bithday = pers[3] + " " + pers[4] + " " + pers[5];
            Date date = null;
            try {
                date = dateFormat.parse(bithday);
            }catch (ParseException e) {

            }

            return new Person(pers[1],pers[2],pers[0],date);
        }

        @Override
        public void close() throws IOException {
                fileScanner.close();
        }
    }
}
