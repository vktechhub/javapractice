package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
   @Bean
   public BeanA beanA() { return new BeanA(); }
 
   @Bean
   public BeanB beanB() {
       // Option 1: Direct call
       return new BeanB(beanA());
   }
 
   @Bean
   public BeanC beanC(BeanA beanA) {
       // Option 2: Injection
       return new BeanC(beanA);
   }
}