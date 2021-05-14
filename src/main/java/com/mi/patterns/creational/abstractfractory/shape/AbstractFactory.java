package com.mi.patterns.creational.abstractfractory.shape;

public abstract class AbstractFactory {
   abstract Color getColor(String color);
   abstract Shape getShape(String shape) ;
}
