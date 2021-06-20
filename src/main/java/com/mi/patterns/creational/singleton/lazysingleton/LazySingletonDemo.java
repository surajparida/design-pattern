package com.mi.patterns.creational.singleton.lazysingleton;

/**
 * Created by Suraj.Parida on 12/31/2015.
 */
public class LazySingletonDemo {
    public static void main(String[] args) {
        LazySingleton object = LazySingleton.getInstance();
        object.showMessage();
    }
}
