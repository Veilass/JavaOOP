//package com.company.lesson25;
//
//import java.sql.Driver;
//
//public class Test1 {
//    public static void main(String[] args) {
//        Employee emp1 = new Teacher();
//        Employee emp2 = new Policeman();
//        Employee emp3 = new Doctor();
//        String s1 = null;
//        Object o = new Object();
//
//        Employee [] arr2 = {emp1,emp2,emp3 };
////        for (Employee emp : arr2){
////            emp.work();
////        }
//        System.out.println(o instanceof Teacher);
//
//    }
//}
//
//
//
//abstract class Employee{
//    void sleep(){
//        System.out.println("Employee sleeps");
//    }
//   abstract void work();
//}
//
//class Teacher extends Employee implements Help_abel{
//    void work(){
//        System.out.println("Teacher works");
//    }
//    public void help(){
//        System.out.println("Teacher help");
//    }
//}
//
//class Policeman extends Employee implements Help_abel{
//    void work(){
//        System.out.println("Policeman works");
//    }
//    public void help(){
//        System.out.println("Teacher help");
//    }
//}
//
//class Doctor extends Employee implements Help_abel{
//    void work(){
//        System.out.println("Doctor works");
//    }
//    public void help(){
//        System.out.println("Teacher help");
//    }
//}
//
//interface Help_abel{
//    void help();
//}