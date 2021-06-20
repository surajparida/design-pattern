package com.mi.patterns.creational.singleton.innerstaticsingleton;

public class InnerStaticSingleton {
    private InnerStaticSingleton() {}

    private static class InnerStaticSingletonImpl {
        private static final InnerStaticSingleton instance = new InnerStaticSingleton();
    }

    public static InnerStaticSingleton getInstance() {
        return  InnerStaticSingletonImpl.instance;
    }

    public void showMessage() {
        System.out.println("Hello World!");
    }
}
