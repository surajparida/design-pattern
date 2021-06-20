package com.mi.patterns.creational.singleton.enumsingleton;

/**
 * Created by Suraj.Parida on 12/31/2015.
 */
public enum SingletonEnum {
    INSTANCE;

    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
