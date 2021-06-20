package com.mi.patterns.creational.prototype.serialization;

import java.io.Serializable;

public class Person implements Serializable {
    public String firstName;
    public String lastname;

    public Person(String firstName, String lastname) {
        this.firstName = firstName;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
