package com.mi.patterns.creational.singleton.monostatesingleton;

/**
 * Created by Suraj.Parida on 12/31/2015.
 */
public class MonoStateSingleton {
    //create an object of SingleObject
    private static String name;

    public void setName(String name) {
        MonoStateSingleton.name = name;
    }

    public String getName() {
        return name;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
