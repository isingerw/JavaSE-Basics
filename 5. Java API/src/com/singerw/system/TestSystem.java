package com.singerw.system;

import java.util.Scanner;

public class TestSystem {
    public static void main(String[] args) {
        // ���
        System.err.println("abc");
        System.out.println("abc");
        // ����
        Scanner input = new Scanner(System.in);

        // �����ķ���
        // 1 ��������������
        System.gc();
        // 2 ��ǰʵ�ʺ���ֵ(��ǰʱ�� ����1970-1-1�Ĳ�ֵ)
        System.out.println(System.currentTimeMillis());
        // 3 �˳� ��ֹ�����,ͨ��������������
        System.exit(0);
        System.out.println("over");
    }
}
