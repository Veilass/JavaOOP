package com.company.lesson24;

public class Test3 {
    public static void main(String[] args) {
        Help_able h = new Driver();
        swim_able s = new Driver();
        Employee e = new Driver();
        System.out.println(h.a);
        System.out.println();
        h.help();
        h.PutOutTheFire("вода");
        s.swim();
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
    class Teacher extends Employee implements Help_able {
    int countStudents;
    void teach(){
        System.out.println("Учить");
    }
       public void help(){
            System.out.println("Учитель оказывает помощь");
        }
       public void PutOutTheFire(String s){
           System.out.println("Учитель тушит пожар " + s);
       }
}
    class Driver extends Employee implements Help_able,swim_able{
        public void help(){
            System.out.println("Водитель оказывает помощь");
        }
        public void PutOutTheFire(String s){
            System.out.println("Водитель тушит пожар" + s);
        }
        public void swim(){
            System.out.println("Водитель может плавать");
        }
    void drive(){
        System.out.println("Водить");
    }

}

 interface Help_able{
    void help();
    void PutOutTheFire(String subject);
    public final static int a = 10;
 }

 interface swim_able{
    void swim();
 }

abstract class Y implements swim_able{}
abstract class X extends Y{}
class Z extends Y{
    public void swim() {

    }
}