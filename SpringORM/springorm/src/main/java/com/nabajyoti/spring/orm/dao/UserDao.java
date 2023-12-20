package com.nabajyoti.spring.orm.dao;


import org.springframework.orm.hibernate5.HibernateTemplate;

import com.nabajyoti.spring.orm.entities.User;

public class UserDao {

    private HibernateTemplate hibernateTemplate;

    public void getUser(String user){
        Object u = hibernateTemplate.get(User.class, user);
        System.out.println(u);
    }

}
