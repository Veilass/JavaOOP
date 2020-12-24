package com.company.lesson27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test14 {
    static FileInputStream fis1,fis2;

    public static void main(String[] args) {
        try {
            fis1 = new FileInputStream("test9.txt");
            System.out.println("file test 9 found in system");
            try {
                fis2.close();
            }catch (IOException e){
                System.out.println("Problems with stream-om fis2");
            }
        }catch (FileNotFoundException e){
            System.out.println("file test9 not found");
        }catch (NullPointerException e){
            System.out.println("Worked NullPointException");
        }
    }
}
