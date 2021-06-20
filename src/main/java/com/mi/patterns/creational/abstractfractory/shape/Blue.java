package com.mi.patterns.creational.abstractfractory.shape;

public class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
