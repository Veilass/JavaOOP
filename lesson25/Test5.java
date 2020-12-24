package com.company.lesson25;

public class Test5 {
}

class Test10{
    int a = 5;
    void abc(){
        System.out.println("ok1");
    }
}

class Test20 extends Test10{
    int a = 10;
    void abc(){
        System.out.println("ok2");
    }
}

class Test30 extends Test20{
    int a = 15;
    void abc(){
        System.out.println("ok3");
    }

    public static void main(String[] args) {
        Test30 t = new Test30();
        ((Test10)t).abc();
    }
}
