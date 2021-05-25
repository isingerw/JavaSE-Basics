package com.singerw.stringdemo;

public class TestStringBuffer {

    public static void main(String[] args) {
        // 不能直接复制，new可变的字符串，常见方法append,在尾部添加新的字符串
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("abc");
        stringBuffer.append("xyz");
        System.out.println(stringBuffer);

        System.out.println(stringBuffer.capacity());
        System.out.println(stringBuffer.length());
        System.out.println(stringBuffer.reverse());
    }
}
