package com.singerw.stringdemo;

public class TestStringBuffer {

    public static void main(String[] args) {
        // ����ֱ�Ӹ��ƣ�new�ɱ���ַ�������������append,��β������µ��ַ���
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("abc");
        stringBuffer.append("xyz");
        System.out.println(stringBuffer);

        System.out.println(stringBuffer.capacity());
        System.out.println(stringBuffer.length());
        System.out.println(stringBuffer.reverse());
    }
}
