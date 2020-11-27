package com.javarush.task.task12.task1218;

/* 
Есть, летать и двигаться
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public static class Dog implements CanEat, CanMove{
        public void move() {

        }
        public void eat() {

        }
    }

    public static class Duck implements CanMove,CanFly,CanEat{
        public void move(){

        }
        public void eat() {

        }
        public void fly() {}

    }

    public static class Car implements CanMove{
        public void move(){}
    }

    public static class Airplane implements CanFly, CanMove{
        public void fly() {}
        public void move() {}
    }
}
