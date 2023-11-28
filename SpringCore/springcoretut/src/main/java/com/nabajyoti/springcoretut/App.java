package com.nabajyoti.springcoretut;


import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("anynameforconfig.xml");
        // context.registerShutdownHook(); - for shutting down context later when jvm shuts down
        Student student1 = (Student) context.getBean("student1");
        System.out.println(student1);

        Teacher teacher1 = (Teacher) context.getBean("teacher1");
        System.out.println(teacher1);
        context.close();
    }
}
