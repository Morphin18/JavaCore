package com.javarush.task.task16.task1632;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static {
        threads.add(new ThreadOne());
        threads.add(new ThreadSecond());
        threads.add(new ThreadThree());
        threads.add(new ThreadFour());
        threads.add(new ThreadFive());

    }

    public static void main(String[] args) {
    }
    public static class ThreadOne extends Thread{
        @Override
        public void run() {
            while (true) {

            }
        }
    }

    private static class ThreadSecond extends Thread {
        @Override
        public void run() {
            while (true) {
                if (Thread.interrupted()) {
                    try {
                        throw new InterruptedException();
                    } catch (InterruptedException e) {
                        System.out.println("InterruptedException");
                    }

                }
            }
        }
    }

    private static class ThreadThree extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println("Ура");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {

                }
            }
        }
    }

    private static class ThreadFour extends Thread implements Message{
        @Override
        public void run() {

         while(!isInterrupted()) {

         }

        }

        @Override
        public void showWarning() {
            if (isAlive()) {interrupt();}
        }
    }

    private static class ThreadFive extends Thread {
        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String string;
            int sum = 0;
            try {
                while (true) {
                    string = reader.readLine();
                    if (string.equals("N")) {break;}
                    sum += Integer.parseInt(string);
                }
                System.out.println(sum);

            } catch (IOException e) {
            }

        }
    }
}