package com.nabajyoti.springcoretut.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {

    @Autowired
    @Qualifier("address2")
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
