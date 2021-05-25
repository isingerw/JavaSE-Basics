package com.singerw.stringdemo;

public class TestTask2 {
    public static void main(String[] args) {
        String str = "ILoveJava";
        String str1 = "I";
        String str2 = "Love";
        String str3 = "Java";
        System.out.println(str == (str1 + str2 + str3));

        String str4 = "I" + "Love" + "Java";
        System.out.println(str == str4);

        String str5 = (str1 + str2 + str3).intern();
        String str6 = str5;
        System.out.println(str == str6);
    }
}
