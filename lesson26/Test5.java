package com.company.lesson26;

public class Test5 {
    {
        System.out.println("Eto init block 3");
    }


    Test5(){
        System.out.println("eto constr 1");
    }
    Test5(int a){
        this();
        System.out.println("eto constr 2");
    }


    {
        System.out.println("Eto init block 1");
    }

    static     {
        System.out.println("Eto STATIC init block");
    }
    {
        System.out.println("eto init block 2");
    }
    static {
        System.out.println("Eto STATIC init block 2");
    }

    public static void main(String[] args) {
        Test5 t = new Test5();
        Test5 t2 = new Test5(3);

    }
}
