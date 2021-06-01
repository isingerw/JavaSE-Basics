package com.singerw.datedemo;

import java.time.LocalTime;

public class TestLocalTime {
    public static void main(String[] args) {
        // 1用当前日期生成LocalTime
        LocalTime localTime1 = LocalTime.now();
        System.out.println(localTime1);

        //2使用指定数字生成LocalTime
        LocalTime localTime2 = LocalTime.of(23, 51, 23);
        System.out.println(localTime2);
        //返回各字段值
        System.out.println("时：" + localTime2.getHour() + " 分：" + localTime2.getMinute() + " 秒：" + localTime2.getSecond());


        // 3参数可以是一个字符串
        // 将字符串转换
        LocalTime localTime3 = LocalTime.parse("11:43:23");
        System.out.println(localTime3);
    }
}
