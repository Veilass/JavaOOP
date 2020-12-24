package com.company.lesson28;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Test3 {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2014,5,31);
        LocalDate ld2 = LocalDate.of(2012, Month.MAY,16);
//        System.out.println(ld1.isBefore(ld2));

        LocalTime lt1 = LocalTime.of(15,30);
        LocalTime lt2 = LocalTime.of(12,30,35,35253);
        System.out.println(lt1.isAfter(lt2));

        LocalDateTime ldt1 = LocalDateTime.of(2015,9,10,18,25);
        LocalDateTime ldt2 = LocalDateTime.of(2015,9,10,18,25,36,3);
        System.out.println(ldt1.isBefore(ldt2));
    }
}
