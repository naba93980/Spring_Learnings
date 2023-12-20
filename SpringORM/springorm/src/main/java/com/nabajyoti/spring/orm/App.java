package com.nabajyoti.spring.orm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nabajyoti.spring.orm.dao.UserDao;

public class App 
{
    public static void main( String[] args )
    {	
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        UserDao u = context.getBean("userDao", UserDao.class);
        u.getUser("naba@gmail.com");

    }
}
