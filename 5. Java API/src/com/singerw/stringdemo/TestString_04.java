package com.singerw.stringdemo;

public class TestString_04 {
    public static void main(String[] args) {
        String str = new String("zhangsingerw@gmail.com");
        // 1.charAT
        char ch = str.charAt(0);
        System.out.println(ch);

        // 2.lenght��������ǰ�ַ�������
        int le = str.length();
        System.out.println(le);
        // ��ȡ���һ���ַ�
        System.out.println(str.charAt(le - 1));

        // 3.index ���ҵ���������λ�ã�û�ҵ�����-1
        int index1 = str.indexOf("@");
        System.out.println("index:" + index1 + "λ");

        // 4.startWith endsWith
        boolean flag1 = str.startsWith("zhang");
        System.out.println(flag1);

        boolean flag2 = str.endsWith(".com");
        System.out.println(flag2);

        // 5.intern  �����ַ�������Ĺ淶��ʾ
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
        // ����12-17��������17
        System.out.println(str2.substring(12, 17));

        // 8.replace �滻 --> �����˵�
        String str3 = "singerw.com";
        System.out.println(str3.replace("singerw", "zhangsingerw"));

        // 9.trim ȥ��β�ո������û������û���������ʱ����Ҫȥ���ո�
        System.out.println(" j a v a ".trim().length());
    }
}
