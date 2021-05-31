package com.singerw.map.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: TestHashMap
 * @Description: //TODO ������
 * @Author: CodeSleep
 * @Date: 2021-05-31 10:08
 * @Version: 1.0
 */
public class TestHashMap {
    public static void main(String[] args) {
        // �ӿ����� = ʵ�������
        Map map = new HashMap();

        // ������ = �����
        HashMap hashMap = new HashMap();

        // 1 ���Ԫ��
        hashMap.put("1", "singer");
        hashMap.put("2", "image.singerw.com");
        hashMap.put("3", "singer.com");
        // 2 ��ȡԪ�أ�ͨ��key�õ�V
        System.out.println(hashMap.get("1"));

        // 3 ���һ�ظ���key�Ḳ��ԭ�����ڵ��Ǹ�value
        hashMap.put("1", "zhangsingerw");
        System.out.println(hashMap.get("1"));

        //4 size element����
        System.out.println(hashMap.size());

        // 5 ���� ֵ�� ��ֵ�ϼ�
        System.out.println("keySet:" + hashMap.keySet());
        System.out.println("values" + hashMap.values());
        System.out.println("entrySet" + hashMap.entrySet());

        // 6 �����õ���
        for (Object o : hashMap.keySet()) {
            System.out.println("keySet" + o);
        }

        // 7 �����õ�ֵ
        for (Object o : hashMap.values()) {
            System.out.println("values" + o);
        }

        // 8 ��ѯ contains
        System.out.println("containsKey:" + hashMap.containsKey("1"));
        System.out.println("containsValue" + hashMap.containsValue("singer.com"));

        // 9 ɾ��
        System.out.println(hashMap.remove("1"));
        System.out.println(hashMap.containsKey("1"));
    }
}
