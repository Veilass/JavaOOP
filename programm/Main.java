package programm;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        final data user = new data();


        Thread name1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    user.name1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread log1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    user.log1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread age1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    user.age1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread hob1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    user.hob1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread output = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    user.output1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        try {
            name1.start();
            log1.start();
            age1.start();
            hob1.start();
            output.start();
            name1.join();
            log1.join();
            age1.join();
            hob1.join();
            output.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    FileOutputStream fil;
        try {
            fil = new FileOutputStream("dz.dz");
                ObjectOutputStream obe = new ObjectOutputStream(fil);

                obe.writeObject(output);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
