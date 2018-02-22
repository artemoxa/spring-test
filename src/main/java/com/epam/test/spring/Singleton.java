package com.epam.test.spring;

public class Singleton {

    private static Singleton instance = new Singleton();

    private Singleton{
    }

    public static Singleton getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "Singleton{}";
    }
}
