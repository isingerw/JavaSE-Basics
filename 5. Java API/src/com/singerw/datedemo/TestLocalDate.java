package com.singerw.datedemo;

import java.time.LocalDate;

public class TestLocalDate {
    public static void main(String[] args) {
        //1用当前日期生成LocalDate
        LocalDate localDate1 = LocalDate.now();
        System.out.println(localDate1);

        //2使用指定数字生成LocalDate
        LocalDate localDate2 = LocalDate.of(2021, 05, 14);
        System.out.println(localDate2);
        //返回各字段值
        System.out.println("年：" + localDate2.getYear() + " 月：" + localDate2.getMonthValue() + " 日：" + localDate2.getDayOfMonth());

        // 3参数可以是一个字符串
        //将字符串转换
        LocalDate localDate3 = LocalDate.parse("2021-06-23");
        System.out.println(localDate3);
    }
}
