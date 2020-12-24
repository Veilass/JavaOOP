package com.company.lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test9 {
        void abc() throws FileNotFoundException{
            try {
                File f = new File("test9.txt");
                FileInputStream fis = new FileInputStream(f);
            }catch (FileNotFoundException e){
                System.out.println("Exception catch");
                throw e;
            }finally {
                System.out.println("It finally");
            }
        }

//    void def(){
//        try {
//           int array[] = {1,2,3};
//            System.out.println(array[5]);
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Exception catch");
//            throw e;
//        }finally {
//            System.out.println("It finally");
//        }
//    }
}
