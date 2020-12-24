package com.company.lesson23;

public class Test5 {

    public static void main(String[] args) {
        Employee e = new Teacher();
        Employee emp = new Employee();
        Teacher t = new Teacher();
        e.eat();
    }
}


class Food{}
class Fruit extends Food{}
class Employee{
    double salary = 100;
    String name;

     public Food eat(){
        System.out.println("Кушает работник");
        Food f = new Food();
        return f;
    }

   final static void sleep(){ System.out.println("Спит работник"); }
}



class Teacher extends Employee{

    String salary = "200";

    public Food eat(){
        System.out.println("Кушает учитель");
        Fruit f = new Fruit();
        return f;
    }


//    static void sleep(){ System.out.println("Спит учитель"); }

    int countStudents;

    void teach(){
        System.out.println("Учить");
    }

}

final class T{}

class P{}