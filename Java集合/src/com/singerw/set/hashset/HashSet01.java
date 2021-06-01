package com.singerw.set.hashset;


import java.util.HashSet;
import java.util.Iterator;

/**
* 
* @Author ����
* @Date 2021-05-28 10:42
*/
public class HashSet01 {

    public static void main(String[] args) {
        HashSet set1 = new HashSet();

        // 1 ���Ԫ�أ����ظ���
        set1.add("tom");
        set1.add("jerry");
        set1.add("tom");

        // 2 �ܷ�Ϊnull
        // ����
        set1.add(null);
        // �������ظ�
        set1.add(null);

        System.out.println(set1.contains("tom"));

        // 3 �鿴size
        System.out.println(set1.size());
        // ���-->������֤˳��

        // 4 ��ȡ������
        Iterator itor = set1.iterator();
        System.out.println(itor);

        // itor���� hasNext()
        while(itor.hasNext()){
            Object obj = itor.next();
            System.out.println(obj);
        }

        // 5 ɾ��
        set1.remove(null);
        System.out.println("********************************");
        set1.iterator();
        while (itor.hasNext()){
            Object obj = itor.next();
            System.out.println(obj);
        }
    }
}
