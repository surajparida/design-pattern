package com.mi.patterns.creational.abstractfractory.drinkmaker;

public class Coffee implements IHotDrink {
    @Override
    public void consume() {
        System.out.println("This coffee is delicious");
    }
}
