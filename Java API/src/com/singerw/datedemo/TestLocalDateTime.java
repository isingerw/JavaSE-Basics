package com.singerw.datedemo;

import java.time.LocalDateTime;

public class TestLocalDateTime {
    public static void main(String[] args) {
        //1�õ�ǰ��������LocalDateTime
        LocalDateTime localDateTime1 = LocalDateTime.now();
        System.out.println("datetime1:" + localDateTime1);

        //2ʹ��ָ����������LocalDateTime
        LocalDateTime localDateTime2 = LocalDateTime.of(2021, 05, 14, 15, 45, 45);
        System.out.println("datetime2:" + localDateTime2);
        //���ظ��ֶ�ֵ
        System.out.println("ʱ��" + localDateTime2.getHour() + " �֣�" + localDateTime2.getMinute() + " �룺" + localDateTime2.getSecond());

        // 3����������һ���ַ���
        //���ַ���ת��
        LocalDateTime localDateTime3 = LocalDateTime.parse("2009-12-12T12:34:09");
        System.out.println("datetime3:" + localDateTime3);
    }
}
