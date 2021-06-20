package com.mi.patterns.creational.abstractfractory.drinkmaker;

public interface IHotDrinkFactory {
    IHotDrink prepare(int amount);
}

