package com.singerw.stringdemo;

public class TestString_04 {
    public static void main(String[] args) {
        String str = new String("zhangsingerw@gmail.com");
        // 1.charAT
        char ch = str.charAt(0);
        System.out.println(ch);

        // 2.lenght方法，提前字符串长度
        int le = str.length();
        System.out.println(le);
        // 提取最后一个字符
        System.out.println(str.charAt(le - 1));

        // 3.index 有找到返回索引位置，没找到返回-1
        int index1 = str.indexOf("@");
        System.out.println("index:" + index1 + "位");

        // 4.startWith endsWith
        boolean flag1 = str.startsWith("zhang");
        System.out.println(flag1);

        boolean flag2 = str.endsWith(".com");
        System.out.println(flag2);

        // 5.intern  返回字符串对象的规范表示
        String intern = str.intern();
        System.out.println(intern);

        // 6.solit
        String str2 = "hello ,world ,l ,am ,java";
        String[] array = str2.split(",");
        System.out.println(array.length);
        for (String s : array) {
            System.out.println(s);
        }

        // 7.substring
        System.out.println(str2.substring(12));
        // 所有12-17，不包括17
        System.out.println(str2.substring(12, 17));

        // 8.replace 替换 --> 做过滤的
        String str3 = "singerw.com";
        System.out.println(str3.replace("singerw", "zhangsingerw"));

        // 9.trim 去首尾空格（如在用户输入用户名和密码时，需要去除空格）
        System.out.println(" j a v a ".trim().length());
    }
}
