package com.singerw.stringdemo;

// java.lang包默认导入，无需手动导入
public class TestString_01 {
    public static void main(String[] args) {
        String str1 = new String();
        String str2 = new String("hello");
        String str3 = new String("hello");
        // 地址
        System.out.println(str2 == str3);
        // 底层原理：转换为字符数组，依次比较
        System.out.println(str2.equals(str3));


        //存储位置在常量池中。
        String str4 = "java";
        String str5 = "java";
        // 地址
        System.out.println(str4 == str5);
        // 底层原理：转换为字符数组，依次比较
        // 但是如果按照上字面值的方式来赋值，直接判断==的时候，str4与str5的地址是一样的。
        System.out.println(str4.equals(str5));

        String str6 = new String("java");
        System.out.println(str6 == str5);
        System.out.println(str6.equals(str5));
    }
}
