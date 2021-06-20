package com.mi.patterns.creational.singleton.staticsingleton;

import java.io.File;

public class StaticSingleton {
    private static StaticSingleton singleton;

    private StaticSingleton() throws Exception {
        System.out.println("Initializing object");
        File.createTempFile(".", ".");
    }

    static {
        try {
            // Can be used when we need object pooling
            singleton = new StaticSingleton();
        } catch (Exception e) {
            System.err.println("Error while creating object ");
        }
    }

    public static StaticSingleton getInstance() {
        return singleton;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
