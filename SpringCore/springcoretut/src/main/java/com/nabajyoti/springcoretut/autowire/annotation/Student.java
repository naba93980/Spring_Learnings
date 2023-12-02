package com.nabajyoti.springcoretut.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

    @Autowired
    private Address address;
    
    public Address getAddress() {
        return address;
    }
    
    public void setAddress(Address address) {
        System.out.println("setting address");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student [address=" + address.toString() + "]";
    }

}
