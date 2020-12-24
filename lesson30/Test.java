package com.company.lesson30;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        var tit = new TestInferenceType();
        var i = 10;
        var w = 1.5f;
        var array = new String[]{"a","b"};
        var result = abc();
        Object obj1 = "privet";
        var obj2 = obj1;
        ArrayList<String> al = new ArrayList<>();
        for (var s: al){
            System.out.println(s);
            var array2 = new int[]{1,2};
            var array3 = new int[]{1,2};
            var var = "var";
        }
    }

    static double abc(){
        return 3.14;
    }
}


class TestInferenceType{ }

interface I{
   void abc();

   default void def(){}
   default void def2(){}
   static void def3(){}
}