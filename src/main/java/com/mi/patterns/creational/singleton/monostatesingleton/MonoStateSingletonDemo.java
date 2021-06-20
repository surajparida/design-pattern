package com.mi.patterns.creational.singleton.monostatesingleton;

/**
 * Created by Suraj.Parida on 12/31/2015.
 */
public class MonoStateSingletonDemo {
    public static void main(String[] args) {
        MonoStateSingleton singleton = new MonoStateSingleton();
        singleton.setName("MonoState");
        singleton.showMessage();
        MonoStateSingleton singleton2 = new MonoStateSingleton();
        singleton2.showMessage();
    }
}
