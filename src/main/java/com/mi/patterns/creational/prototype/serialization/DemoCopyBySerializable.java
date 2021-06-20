package com.mi.patterns.creational.prototype.serialization;

import org.apache.commons.lang3.SerializationUtils;

public class DemoCopyBySerializable {
    public static void main(String[] args) {
        Person john = new Person("John", "Smith");

        Person johnCopy = SerializationUtils.roundtrip(john);

        john.lastname = "SMITH";

        System.out.println(john);
        System.out.println(johnCopy);
    }

}
