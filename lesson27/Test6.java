package com.company.lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test6 {
    public static void main(String[] args) {
        try {
            File f = new File("test8.txt");
            FileInputStream fis = new FileInputStream(f);
        }catch (FileNotFoundException e){
            System.out.println("Was catch Exception 1");
        }catch (NullPointerException e) {
            System.out.println("Was catch Exception 2");
        }catch (RuntimeException e){
            System.out.println("Was catch Exception 4");
        }catch (Exception e){
            System.out.println("Was catch Exception 5");
        }catch (Throwable e){
            System.out.println("Was catch Exception 6");
        }
    }
}
