package com.singerw.datedemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFormat {
    public static void main(String[] args) throws ParseException {
        // 时间格式：yyyy-MM-dd HH-mm-ss 年-月-日 时:分:秒
        SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        // String --> date
        String str = "2021-05-35 10:17:45";
        // 转换
        Date datestr = simple.parse(str);
        System.out.println(datestr);

        // date --> String
        Date now = new Date();
        System.out.println(now);
        // 参数转换，参数为Date类型，返回值为String
        String formatdate = simple.format(now);
        System.out.println(formatdate);
    }
}
