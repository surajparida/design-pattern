package com.mi.patterns.creational.singleton.staticsingleton;

public class StaticSingletonPatternDemo {
    public static void main(String[] args) {
        StaticSingleton object = StaticSingleton.getInstance();
        object.showMessage();
    }
}
