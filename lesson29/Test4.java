package com.company.lesson29;

public class Test4 {

    static void def(Test t){
        System.out.println(t.abc("Privet"));
    }

    public static void main(String[] args) {
        def(x -> {x="ok";return x.length(); } );
    }
}

interface Test{
    int abc(String s);
}