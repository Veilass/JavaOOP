package com.company.lesson26;

public class Test6 {
    int a = 3;
    Test6(){
        a =4;
    }
    {
        a=5;
    }

//    public static void main(String[] args) {
//        Test6 test6 = new Test6();
//        System.out.println(test6.a);
//    }
}


class A{
    static final int b;
int a = 5;
    static {
        b =10;
    }
}

class B{
    static int c;
    static final int d;
    static final int i = 1;
    static final int f;
    static {
        c = 5;
        d = 3;
//        i = 2;
        f = 0;
    }

}

class C{
    String s = "ok";
    { System.out.println(s); }
    static int i = 0;
    static {
        System.out.println(i);
    }
  {i = i +1;
        System.out.println(i);}
    C(){
        System.out.println("Это конструктор");
    }





    public static void main(String[] args) {
        System.out.println("Privet vsem");
        C c = new C();
    }
}

class D{
    static {abc(2);}
    static void abc(int a){System.out.print(a + " ");}
    D(){abc(5);}
    static {abc(4);}
    {abc(6);}
    static {new D();}
    {abc(8);}

    public static void main(String[] args) {

    }
}