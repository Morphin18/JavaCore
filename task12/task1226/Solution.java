package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
*/

public class Solution {

    public static void main(String[] args) {

    }
    public interface CanFly {
        void fly();
    }
    public interface CanClimb {
        void climb();
    }
    public interface CanRun {
        void run();
    }
    public static class Cat implements CanClimb, CanRun{
        public void run() {}
        public void climb() {}
    }

    public static class Dog implements CanRun {
        public void run() {}
    }

    public static class Tiger extends Cat {
        @Override
        public void run() {
            super.run();
        }

        @Override
        public void climb() {
            super.climb();
        }
    }

    public static class Duck implements CanFly , CanRun{
        public void fly() {}
        public void run() {}
    }
}
