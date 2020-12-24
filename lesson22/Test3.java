package com.company.lesson22;

public class Test3 {
    void upZp(Employee e){ e.salary = e.salary+100; }

    public static void main(String[] args) {

        Doctor doc = new Doctor();
        doc.name = "Ivan";
        doc.age = 50;
        doc.experience = 25;
        doc.eat();
        doc.heal();
        doc.sleep();

    }
}


class Employee{
    double salary;
    String name;
    int age;
    int experience;

    void eat(){ System.out.println("Кушать"); }
    void sleep(){ System.out.println("Спать"); }
}

class Doctor extends Employee{
    void heal(){ System.out.println("Лечить"); }
}

class Hirurg extends Doctor{
    String skalpel;
    void operation(){}
}

class Dantist extends Doctor{

}