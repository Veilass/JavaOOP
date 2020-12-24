package com.company.lesson25;


public class Test3 {
    public static void main(String[] args) {

        Employee emp1 = new Doctor();
        Employee emp2 = new Teacher();
        Employee emp3 = new Driver();
        Employee emp4 = new Employee();
        Employee [] array = {emp1, emp2, emp3, emp4};
        for (Employee e: array){
            if(e instanceof Driver){
                System.out.println(((Driver)e).nameCar);
                ((Driver) e).drive();
            }
        }
    }
}

    class Employee{
        double salary = 100;
        String name = "kolya";
        int age;
        int experience;

        void eat(){ System.out.println("Кушать"); }
        void sleep(){ System.out.println("Спать"); }
    }

    class Doctor extends Employee implements Help_abel {
    public void help(){
        System.out.println("Doctor renders heal ");
    }
        String spezalize = "xirurg";
        void heal(){ System.out.println("Лечит"); }
    }

    class Teacher extends Employee {
        void teach(){ System.out.println("Учит"); }
    }

    class Driver extends Employee {
        String nameCar = "BMW";
        void drive(){ System.out.println("Водит"); }
    }

interface Help_abel{
    void help();
}