package com.singerw.datedemo;

import java.time.LocalDateTime;

public class TestLocalDateTime {
    public static void main(String[] args) {
        //1用当前日期生成LocalDateTime
        LocalDateTime localDateTime1 = LocalDateTime.now();
        System.out.println("datetime1:" + localDateTime1);

        //2使用指定数字生成LocalDateTime
        LocalDateTime localDateTime2 = LocalDateTime.of(2021, 05, 14, 15, 45, 45);
        System.out.println("datetime2:" + localDateTime2);
        //返回各字段值
        System.out.println("时：" + localDateTime2.getHour() + " 分：" + localDateTime2.getMinute() + " 秒：" + localDateTime2.getSecond());

        // 3参数可以是一个字符串
        //将字符串转换
        LocalDateTime localDateTime3 = LocalDateTime.parse("2009-12-12T12:34:09");
        System.out.println("datetime3:" + localDateTime3);
    }
}
