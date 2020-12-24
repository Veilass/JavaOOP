package com.company.lesson22.p1;

import com.company.lesson22.Human1;

public class Student extends Human1 {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(Student.salary);
        s.work();
        Student.rest();
    }
}


class Test{
    public static void main(String[] args) {
    }
}