package com.singerw.set.treeset;

/**
 * ����һ������������Ϊ�ַ���������Ϊ�ַ���
 * ���ݵĲ�����ʽΪ "Hello,WoRd!"
 * �ڷ����ж��ַ������д���Ҫ�󷵻�ֵΪhelloWord
 *
 * @Author ����
 * @Date 2021-05-28 16:44
 */
public class HelloWordTask {
    public static void main(String[] args) {
        HelloWordTask hello = new HelloWordTask();
        hello.helloWord("Hello,WoRd");
    }

    public String helloWord(String string) {
        // 1.���ַ������ָ�Ϊ�ַ�������
        String[] array = string.split(",");
        for (int i = 0; i < array.length; i++) {
            // hello ==> H
            array[i] = array[i].substring(0, 1).toLowerCase() + array[i].substring(1).toLowerCase();
            String result = array[i];
            System.out.print(result);
        }
        return string;
    }
}
