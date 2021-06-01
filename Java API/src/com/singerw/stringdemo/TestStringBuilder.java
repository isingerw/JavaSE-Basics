package com.singerw.stringdemo;

public class TestStringBuilder {
    public static void main(String[] args) {
        // 不能直接复制，new可变的字符串，常见方法append,在尾部添加新的字符串
        // StringBuffer 线程同步 ==> 线程安全
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("abc");
        stringBuilder.append("xyz");
        System.out.println(stringBuilder);

        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.reverse());
    }
}
