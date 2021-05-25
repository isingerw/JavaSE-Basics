package com.singerw.datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFormat {
    public static void main(String[] args) throws ParseException {
        // ʱ���ʽ��yyyy-MM-dd HH-mm-ss ��-��-�� ʱ:��:��
        SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // String --> date
        String str = "2021-05-35 10:17:45";
        // ת��
        Date datestr = simple.parse(str);
        System.out.println(datestr);

        // date --> String
        Date now = new Date();
        System.out.println(now);
        // ����ת��������ΪDate���ͣ�����ֵΪString
        String formatdate = simple.format(now);
        System.out.println(formatdate);
    }
}
