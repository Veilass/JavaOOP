package com.company.lesson27;

public class Test5 {
    static void abc(){
        System.out.println("Worked abc");
        abc();
    }

    public static void main(String[] args) {
            abc();
    }
}
