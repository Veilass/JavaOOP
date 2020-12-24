package com.company.lesson27;

public class Test1 {
    public static void main(String[] args) {
        Animal am = new Tiger();
        System.out.println(am.a);
        System.out.println(am.b);
        am.abc();
        am.def();
    }

}

class Animal{
    int a =5;
    static int b = 10;
    void abc(){
        System.out.println("non-static method class Animal");
    }
    static void def(){
        System.out.println("static method class Animal");
    }
}

class Tiger extends Animal{
    int a = 15;
    static int b = 20;
    void abc(){
        System.out.println("non-static method class Tiger");
    }
    static void def(){
        System.out.println("static method class Tiger");
    }
}