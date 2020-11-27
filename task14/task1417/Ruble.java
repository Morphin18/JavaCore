package com.javarush.task.task14.task1417;

public class Ruble extends Money{
    @Override
    public String getCurrencyName() {
        return "RUB";
    }
    Ruble(double amount) {
        super(amount);
    }
}
