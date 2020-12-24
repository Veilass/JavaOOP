package com.company.lesson31;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> aL1 = new ArrayList<>();
        int i = aL1.get(0);







        aL1.add(10);
        aL1.add(260);
        aL1.add(699);
        ArrayList<String> aL2 = new ArrayList<>();
        aL2.add("Privet");
        aL2.add("Poka");
        aL2.add("Kak dela");
        int a = GenMethod.getSecondElement(aL1);
        String s = GenMethod.getSecondElement(aL2);
        System.out.println(a);
        System.out.println(s);
    }
}


class GenMethod{
    public static <T> T getSecondElement(ArrayList<T> arrayList){
        return arrayList.get(1);
    }
}
