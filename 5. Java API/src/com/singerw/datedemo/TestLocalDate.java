package com.singerw.datedemo;

import java.time.LocalDate;

public class TestLocalDate {
    public static void main(String[] args) {
        //1�õ�ǰ��������LocalDate
        LocalDate localDate1 = LocalDate.now();
        System.out.println(localDate1);

        //2ʹ��ָ����������LocalDate
        LocalDate localDate2 = LocalDate.of(2021, 05, 14);
        System.out.println(localDate2);
        //���ظ��ֶ�ֵ
        System.out.println("�꣺" + localDate2.getYear() + " �£�" + localDate2.getMonthValue() + " �գ�" + localDate2.getDayOfMonth());

        // 3����������һ���ַ���
        //���ַ���ת��
        LocalDate localDate3 = LocalDate.parse("2021-06-23");
        System.out.println(localDate3);
    }
}
