package com.nabajyoti.springcoretut;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Teacher implements InitializingBean, DisposableBean {
    
    String TeacherId;
    String TeacherName;
    String TeacherAddress;

    public String getTeacherId() {
        return TeacherId;
    }

    public void setTeacherId(String teacherId) {
        System.out.println("setting teacher id");
        TeacherId = teacherId;
    }

    public String getTeacherName() {
        return TeacherName;
    }

    public void setTeacherName(String teacherName) {
        System.out.println("setting teacher name");
        TeacherName = teacherName;
    }

    public String getTeacherAddress() {
        return TeacherAddress;
    }

    public void setTeacherAddress(String teacherAddress) {
        System.out.println("setting teacher address");
        TeacherAddress = teacherAddress;
    }
    
    @Override
    public String toString() {
        return "Teacher [TeacherId=" + TeacherId + ", TeacherName=" + TeacherName + ", TeacherAddress=" + TeacherAddress
                + "]";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("After props set'");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Calling destroy");
    }
    
}
