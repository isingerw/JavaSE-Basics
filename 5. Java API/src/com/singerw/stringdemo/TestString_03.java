package com.singerw.stringdemo;

/**
 * 不变性，字符串一旦赋值，那么在内存中存储后，
 * 如果我们改变引用的值，原来存储的位置的值还是不变的。
 * 只是引用的指向改变了而已。
 */
public class TestString_03 {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(str);
        str += "xyz";
        System.out.println(str);
    }
}
