package com.company.lesson23;

public class Test7 {
    public static void main(String[] args) {
        A c1 = new C();
        c1.abc(new B());
    }
}

class A{
    void abc(A a){
        System.out.println("A");
    }
}

class B extends A{
    void abc(A a){
        System.out.println("BBB");
    }

    void abc(B b1){
        System.out.println("B");
    }
}

class C extends B{
    void abc(B b2){
        System.out.println("C");
    }
}