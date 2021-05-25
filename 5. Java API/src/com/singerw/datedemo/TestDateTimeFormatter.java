package com.singerw.datedemo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TestDateTimeFormatter {

    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDate ldate = LocalDate.now();
        System.out.println(ldate);

        System.out.println("*********LocalDate LocalTime LocalDateTime ==> String*******************");
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        System.out.println(ldate.format(format1));

        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println(time.format(format2));

        System.out.println("********* String ==> LocalDate LocalTime LocalDateTime *******************");

        String str2 = "15点25分";
        DateTimeFormatter time1Formater = DateTimeFormatter.ofPattern("HH点mm分");
        LocalTime time2 = LocalTime.parse(str2, time1Formater);
        System.out.println("time2:" + time2);

        String str3 = "2020年11月11日";
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        LocalDate date2 = LocalDate.parse(str3, dateFormatter);
        System.out.println("date2:" + date2);
    }
}


