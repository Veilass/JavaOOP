package com.company.lesson22;

public class Human1 {


    protected String name = "Kolya";

    protected static int salary = 150;
    protected  void work(){
        System.out.println("Worked");
    }
    protected   static void rest(){
        System.out.println("Rests");
    }
}

class Student extends Human1{
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(Student.salary);
        s.work();
        Student.rest();
    }
}
