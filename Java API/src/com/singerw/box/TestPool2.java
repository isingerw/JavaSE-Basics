package com.singerw.box;

public class TestPool2 {
    public static void main(String[] args) {
        // �ؼ�����ֱ�Ӹ��ƴ洢���ڴ��߼���  --�� ������  --�� ������
        Integer i1 = 1000;
        Integer i2 = 1000;
        // ��������˵,i1��i2ֻ������ݵ�ַ����ͬ�ġ�
        System.out.println("i1 == i2 " + (i1 == i2));

        // ��ÿ��new������new�����Ƕ��ڴ洢�ģ���ַһ����ͬ��
        Integer i3 = new Integer(1000);
        Integer i4 = new Integer(1000);
        System.out.println("i3 == i4 " + (i3 == i4));
    }
}