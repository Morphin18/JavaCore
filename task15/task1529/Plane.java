package com.javarush.task.task15.task1529;

public class Plane implements CanFly{
    public static int passegers;
    @Override
    public void fly() {

    }

    public Plane(int n) {
        passegers = n;
    }
}
