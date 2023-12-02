package com.nabajyoti.springcoretut.autowire;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student s = (Student) context.getBean("student1");
        System.out.println(s);
        
    }
}
