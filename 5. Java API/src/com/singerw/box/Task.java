package com.singerw.box;

public class Task {
    public static void main(String[] args) {
        double i0 = 0.1;
        Double i1 = new Double(0.1);
        Double i2 = new Double(0.1);
        System.out.println("=======equals=======");
        // equals ������Double����������д���Ƚϵ�doubleֵ�Ƿ���ȡ�
        System.out.println(i1.equals(i2));
        System.out.println(i1.equals(i0));

        System.out.println("========================");
        // new��ͬ��ַ�Ƚ�
        System.out.println(i1 == i2);
        // i1��ֱ�Ӹ��ƱȽ�   ��װ���� ��������
        // ֱ�����Ϊ���䣬���߱Ƚ�ֵ�Ƿ���ȡ�
        System.out.println(i2 == i0);

    }
}
