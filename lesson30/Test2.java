package com.company.lesson30;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test2 {

    public static void main(String[] args) {
        List <String> list = List.of("privet","poka","kak dela","vse ok");
        String str = "leglgeg";

        for (String s: list){
            Predicate<String>p = x -> {
                System.out.println(str.length());
                return x.length()>4;
            };
        }

        //1метод вывода всех элементов List
//        for (String s: list){
//        System.out.println(s);
//        }

        //2метод сокращенный вывода всех элементов List
//        list.forEach(s-> System.out.println(s));
//
        //Создаем ArrayList.
//        ArrayList<Integer> aL = new ArrayList<>();
//        aL.add(4);
//        aL.add(1);
//        aL.add(7);
//        aL.add(3);
//        aL.add(6);
//        aL.add(5);
//        aL.add(2);
//        aL.add(8);

//        aL.removeIf(el -> el%3==0);
//        Predicate<Integer> p = el -> el % 3==0;
//        aL.removeIf(p);

//        System.out.println(aL);
//        aL.sort((x,y) -> -x.compareTo(y));
//        System.out.println(aL);
    }
}
