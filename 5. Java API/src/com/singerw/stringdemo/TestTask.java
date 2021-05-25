package com.singerw.stringdemo;

import java.util.Date;

public class TestTask {
    public static void main(String[] args) {
        Date d1 = new Date(100000L);
        Date d2 = new Date(100000L);
        System.out.println(d1.equals(d2));
    }
}
