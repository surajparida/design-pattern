package com.mi.patterns.creational.abstractfractory.shape;

public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
