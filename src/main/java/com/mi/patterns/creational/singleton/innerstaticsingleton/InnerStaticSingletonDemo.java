package com.mi.patterns.creational.singleton.innerstaticsingleton;

public class InnerStaticSingletonDemo {
    public static void main(String[] args) {
        InnerStaticSingleton singleton = InnerStaticSingleton.getInstance();
        singleton.showMessage();
    }
}
