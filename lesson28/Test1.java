package com.company.lesson28;
import java.time.*;
public class Test1 {
    public static void main(String[] args) {
//        LocalDate ld1 = LocalDate.of(2014,5,31);
//        System.out.println(ld1);
//        ld1 = ld1.plusYears(6);
//        System.out.println(ld1);
        LocalTime lt1 = LocalTime.of(15,30);
        lt1 = lt1.minusMinutes(30);
        lt1 = lt1.plusSeconds(16).minusMinutes(15);
        System.out.println(lt1);
//        LocalDateTime ldt1 = LocalDateTime.of(2015,9,10,18,25);
//        System.out.println(ldt1);
//        ldt1 = ldt1.plusYears(3).minusMonths(2).plusMinutes(5).minusSeconds(30);
//        System.out.println(ldt1);
    }
}
