package com.javarush.task.task12.task1227;

/* 
CanFly, CanRun, CanSwim для классов Duck, Penguin, Toad
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        void fly();
    }

    public interface CanRun {
        void run();
    }

    public interface CanSwim {
        void swim();
    }

    public static class Duck implements CanFly ,CanSwim , CanRun{
        @Override
        public void fly() {

        }

        @Override
        public void swim() {

        }

        @Override
        public void run() {

        }
    }

    public static class Penguin implements CanRun, CanSwim {
        @Override
        public void run() {

        }

        @Override
        public void swim() {

        }
    }

    public static class Toad implements CanSwim {
        @Override
        public void swim() {

        }
    }
}
