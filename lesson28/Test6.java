package com.company.lesson28;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Test6 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2020,10,25);
        LocalDateTime ldt = LocalDateTime.of(2020,10,25,15,30);
        LocalTime lt = LocalTime.of(17,40);
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date1 = LocalDate.parse("01 02 2015", f);
        System.out.println(date1);
        LocalDate date2 = LocalDate.parse("2015-01-02");
        System.out.println(date2);


//        System.out.println(ldt);
//        System.out.println(lt.format(f));











//        System.out.println(lt.getHour());
//        DateTimeFormatter dtf1 = DateTimeFormatter.ISO_LOCAL_DATE;
//        DateTimeFormatter dtf2 = DateTimeFormatter.ISO_LOCAL_TIME;
//        System.out.println(lt);
//        System.out.println(lt.format(dtf2));
//        DateTimeFormatter dtf3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
//        System.out.println(ldt);
//        System.out.println(ldt.format(dtf1));
//        DateTimeFormatter dtf4 = DateTimeFormatter.ISO_WEEK_DATE;
//        System.out.println(ld);
//        System.out.println(ld.format(dtf4));

//        DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
//        System.out.println(ld);
//        System.out.println(ld.format(shortFormat));
//        System.out.println(ldt);
//        System.out.println(shortFormat.format(ldt));
//        System.out.println(lt);
//        System.out.println(lt.format(shortFormat));
    }
}
