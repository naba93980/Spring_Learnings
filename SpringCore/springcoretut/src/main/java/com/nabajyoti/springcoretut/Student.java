package com.nabajyoti.springcoretut;

public class Student {

    String studentId;
    String studentName;
    String studentAddress;

    public Student() {
    }

    public Student(String studentId, String studentName, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        System.out.println("setting student Id");
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        System.out.println("setting student Name");
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        System.out.println("setting student Address");
        this.studentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
                + "]";
    }

    public void init() {
        System.out.println("inside init");
    }

    public void destroy() {
        System.out.println("inside destroy");
    }

}
