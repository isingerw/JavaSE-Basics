package com.singerw.list.arraylist;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        // ��ʼ����===��20
        ArrayList list2 = new ArrayList(20);

        // ��Ԫ����ӵ�����β��
        list1.add(1);
        list1.add("singerw");
        list1.add(LocalDateTime.now());
        list1.add(34.56);
        // ���ش��б��Ԫ����
        System.out.println(list1.size());

        // ͨ������λ��������
        // ����λ��1
        System.out.println(list1.get(1));

        // �쳣
        // System.out.println(list1.get(list1.size()));

        list1.add(0, "zhangsingerw");
        System.out.println(list1.size());

        // ɾ��ָ��λ�õ�Ԫ��
        list1.remove(1);
        System.out.println(list1.get(1));

        // forѭ��������������ϵ�Ԫ��
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        // foreachѭ��������������ϵ�Ԫ��
        for (Object object : list1
        ) {
            System.out.println(object);
        }

        // foreach 1.8������
        list1.forEach(System.out::println);

    }
}
