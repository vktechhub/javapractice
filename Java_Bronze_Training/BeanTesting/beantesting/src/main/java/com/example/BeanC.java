package com.example;

public class BeanC {
    private final BeanA beanA;

    public BeanC(BeanA beanA) {
        this.beanA = beanA;
    }

    public BeanA getBeanA() {
        return beanA;
    }
}