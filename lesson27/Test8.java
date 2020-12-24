package com.company.lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test8 {
    StringBuilder abc(){
        StringBuilder a = new StringBuilder("Hello");
        StringBuilder result = new StringBuilder("");
        try {
            File f = new File("test9.txt");
            FileInputStream fis = new FileInputStream(f);
        }catch (FileNotFoundException e){
            System.out.println("Exception catch");
            System.out.println("peremenya a v cath - bloke = " + a);
            return a;
        }finally {
            a.append("!!!");
            System.out.println("It finally");
            System.out.println("peremenya a v catch - bloke = " + a);
        }
        return a;
    }

    public static void main(String[] args) {
        Test8 t = new Test8();
        System.out.println(t.abc());
    }

}
