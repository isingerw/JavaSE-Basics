package com.singerw.stringdemo;

public class TestStringBuilder {
    public static void main(String[] args) {
        // ����ֱ�Ӹ��ƣ�new�ɱ���ַ�������������append,��β������µ��ַ���
        // StringBuffer �߳�ͬ�� ==> �̰߳�ȫ
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("abc");
        stringBuilder.append("xyz");
        System.out.println(stringBuilder);

        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.reverse());
    }
}
