package com.singerw.box;

public class TestInt {
    public static void main(String[] args) {
        // opp����-->��������Զ���
        // int С��/�ǳ� ===> �򵥵���ѧ����
        int a = 1;
        // Integer ����
        // ����ͨ��������.���Ժͷ���
        Integer i = 1;
        i.hashCode();

        // �ַ���  ===> ת��Ϊ int
        int n = Integer.parseInt("123");

        // װ��
        int j = 1;
        Integer jj = j; // �������Ϳ���ֱ�Ӹ�ֵ����װ�࣬���ֲ����� ��װ�䡱
        // ����
        Integer k = new Integer(1);
        int kk = k;  // Integer�����Զ�ת��Ϊ-->int��װ����
    }


}
