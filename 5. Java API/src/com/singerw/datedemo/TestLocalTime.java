package com.singerw.datedemo;

import java.time.LocalTime;

public class TestLocalTime {
    public static void main(String[] args) {
        // 1�õ�ǰ��������LocalTime
        LocalTime localTime1 = LocalTime.now();
        System.out.println(localTime1);

        //2ʹ��ָ����������LocalTime
        LocalTime localTime2 = LocalTime.of(23, 51, 23);
        System.out.println(localTime2);
        //���ظ��ֶ�ֵ
        System.out.println("ʱ��" + localTime2.getHour() + " �֣�" + localTime2.getMinute() + " �룺" + localTime2.getSecond());


        // 3����������һ���ַ���
        // ���ַ���ת��
        LocalTime localTime3 = LocalTime.parse("11:43:23");
        System.out.println(localTime3);
    }
}
