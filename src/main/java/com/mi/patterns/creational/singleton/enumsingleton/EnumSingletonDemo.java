package com.mi.patterns.creational.singleton.enumsingleton;

/**
 * Created by Suraj.Parida on 12/31/2015.
 */
public class EnumSingletonDemo {
    public static void main(String[] args) {
        SingletonEnum instance = SingletonEnum.INSTANCE;
        instance.setValue(100);
        System.out.println(instance.getValue());
    }
}
