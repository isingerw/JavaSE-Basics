package com.singerw.box;

public class TestPool {
    public static void main(String[] args) {
        // �ؼ�����ֱ�Ӹ��ƴ洢���ڴ��߼���  --�� ������  --�� ������
        Integer i1 = 20;
        Integer i2 = 20;
        // ��������˵,i1��i2ֻ������ݵ�ַ����ͬ�ġ�
        System.out.println("i1 == i2 " + (i1 == i2));

        // ��ÿ��new������new�����Ƕ��ڴ洢�ģ���ַһ����ͬ��
        Integer i3 = new Integer(20);
        Integer i4 = new Integer(20);
        System.out.println("i3 == i4 " + (i3 == i4));
    }

}
