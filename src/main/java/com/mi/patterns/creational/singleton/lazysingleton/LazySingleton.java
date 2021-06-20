package com.mi.patterns.creational.singleton.lazysingleton;

/**
 * Created by Suraj.Parida on 12/31/2015.
 */
public class LazySingleton {
    //create an object of SingleObject
    private static LazySingleton instance;

    //make the constructor private so that this class cannot be
    //instantiated
    private LazySingleton() {
    }

    //Get the only object available
    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
