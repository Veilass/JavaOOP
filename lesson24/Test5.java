package com.company.lesson24;

public class Test5 {
}

interface I1{
    default void abc(){ System.out.println("it method def");}
    static void def(){ System.out.println("static method"); }
}

interface I2{
    static void def(){ System.out.println("static method 2");}
}

abstract class O{}

class R extends O implements I1{
    static I2 method1(I2 i){return new D2();}

    public static void main(String[] args) {
      I2 i = new D2();
        method1(i);
    }
}

class D2 implements I2{

}









//class Z2 implements i1{
//    public void abc(){ System.out.println("it the method abc"); }
//
//    public static void main(String[] args) {
//        Z2 z = new Z2();
//        z.abc();
//        z.def();
//        z.ghi();
//    }
//}
