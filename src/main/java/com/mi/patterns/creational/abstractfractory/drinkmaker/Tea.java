package com.mi.patterns.creational.abstractfractory.drinkmaker;

public class Tea implements IHotDrink {
    @Override
    public void consume() {
        System.out.println("This tea is nice but I'd prefer it with milk.");
    }
}
