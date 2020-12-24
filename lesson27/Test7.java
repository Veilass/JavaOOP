package com.company.lesson27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test7 {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder("");
        try {
            File f = new File("test9.txt");
            System.out.println("Object creates");
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Stream creates");
            int counter = 0;
            while (true){
                counter++;
                result.append(fis.read());
                System.out.println("Info reading");
                if(counter == 3){
                    fis.close();
                }
            }
        }catch (FileNotFoundException e){
            System.out.println("Exception 2");
        }catch (IOException e){
            System.out.println("Exception 2");
        }finally {
            System.out.println("It finally");
        }
    }
}
