package com.singerw.set.hashset;


import java.util.HashSet;
import java.util.Iterator;

/**
* 
* @Author ����
* @Date 2021-05-28 10:38
*/
public class HashSet02 {

    public static void main(String[] args) {
        HashSet set1 = new HashSet();

        // 1 ���Ԫ�أ����ظ���
        set1.add("tom");
        set1.add("jerry");
        set1.add("tom");
        set1.add(null);

        // 4 ��ȡ������
        Iterator itor = set1.iterator();
        System.out.println(itor);

        // itor���� hasNext()
        while(itor.hasNext()){
            Object obj = itor.next();
            System.out.println(obj);
        }


    }
}
