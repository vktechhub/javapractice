package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        Student s1 = (Student) ctx.getBean("student");      // Retrieve the bean named "student" from the Spring context
        System.out.println(s1);
        System.out.println("Hello World!");
    }
}
