package com.company.lesson26;

public class Test7 {
    public static void main(String[] args) {
        Lion l = new Lion();
    }
}

class Animal{
    Animal(){ System.out.println("Constr of Anim"); }
    static {System.out.println("Static init in Anim");}
     {System.out.println("non-static init in Anim");}
}

class Mammal extends Animal{
    Mammal(){ System.out.println("Constr of Mammal"); }
    static {System.out.println("Static init in Mammal");}
    {System.out.println("non-static init in Mammal");}
}

class Lion extends Mammal{
    Lion(){ System.out.println("Constr of Lion"); }
    static {System.out.println("Static init in Lion");}
    {System.out.println("non-static init in Lion");}
}
