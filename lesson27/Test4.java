package com.company.lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test4 {

    void abc() throws FileNotFoundException {
        File f = new File("test8.txt");
        FileInputStream fis = new FileInputStream(f);

    }

    void def() throws FileNotFoundException{
        abc();
    }

    public static void main(String[] args) throws FileNotFoundException{
    Test4 test4 = new Test4();
    try {
        test4.def();
    }catch (FileNotFoundException e){
        IOException f = e;
//        System.out.println( e);
//        e.printStackTrace();
        System.out.println(e.getMessage());
    }
    }
}