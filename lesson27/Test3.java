package com.company.lesson27;
import java.io.*;

public class Test3 {
    public static void main(String[] args) throws Exception {
        File f = new File("test9.txt");
        FileInputStream fis = new FileInputStream(f);
//        System.out.println("File found");
        fis.read();
//        FileOutputStream fos = new FileOutputStream(f);
//        fos.write(100);
    }
}
