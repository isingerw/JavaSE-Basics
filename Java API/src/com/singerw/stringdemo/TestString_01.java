package com.singerw.stringdemo;

// java.lang��Ĭ�ϵ��룬�����ֶ�����
public class TestString_01 {
    public static void main(String[] args) {
        String str1 = new String();
        String str2 = new String("hello");
        String str3 = new String("hello");
        // ��ַ
        System.out.println(str2 == str3);
        // �ײ�ԭ��ת��Ϊ�ַ����飬���αȽ�
        System.out.println(str2.equals(str3));


        //�洢λ���ڳ������С�
        String str4 = "java";
        String str5 = "java";
        // ��ַ
        System.out.println(str4 == str5);
        // �ײ�ԭ��ת��Ϊ�ַ����飬���αȽ�
        // �����������������ֵ�ķ�ʽ����ֵ��ֱ���ж�==��ʱ��str4��str5�ĵ�ַ��һ���ġ�
        System.out.println(str4.equals(str5));

        String str6 = new String("java");
        System.out.println(str6 == str5);
        System.out.println(str6.equals(str5));
    }
}
