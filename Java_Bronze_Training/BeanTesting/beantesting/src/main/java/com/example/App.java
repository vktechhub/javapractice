package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App 
{
    public static void main(String[] args) {
        // Initialize the Spring Application Context using AnnotationConfigApplicationContext
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve the beans from the context
        BeanA beanAFromContext = context.getBean(BeanA.class);
        BeanB beanB = context.getBean(BeanB.class);
        BeanC beanC = context.getBean(BeanC.class);

        System.out.println("\n--- Comparison Results ---");
        
        // Compare references: BeanA from context vs BeanA inside BeanB
        boolean isSameAsBeanB = (beanAFromContext == beanB.getBeanA());
        System.out.println("Are BeanA (from context) and BeanA inside BeanB the same instance? " + isSameAsBeanB);
        System.out.println("BeanA (from context) ID: " + beanAFromContext.getId());
        System.out.println("BeanA (inside BeanB) ID: " + beanB.getBeanA().getId());


        // Compare references: BeanA from context vs BeanA inside BeanC
        boolean isSameAsBeanC = (beanAFromContext == beanC.getBeanA());
        System.out.println("\nAre BeanA (from context) and BeanA inside BeanC the same instance? " + isSameAsBeanC);
        System.out.println("BeanA (from context) ID: " + beanAFromContext.getId());
        System.out.println("BeanA (inside BeanC) ID: " + beanC.getBeanA().getId());
        
        // Final verification that all point to the same object
        System.out.println("\nAre all three BeanA references the same? " + (isSameAsBeanB && isSameAsBeanC));

        ((AbstractApplicationContext) context).close();
    }
}