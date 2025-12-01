package com.example;

public class BeanA {
    private static int instanceCount = 0;
    private int id;

    public BeanA() {
        instanceCount++;
        id = instanceCount;
        System.out.println("BeanA instance " + id + " created.");
    }

    public int getId() {
        return id;
    }
}
