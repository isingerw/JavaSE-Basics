package com.singerw.list.arraylist;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList();
        // 初始容量===》20
        ArrayList list2 = new ArrayList(20);

        // 将元素添加到集合尾部
        list1.add(1);
        list1.add("singerw");
        list1.add(LocalDateTime.now());
        list1.add(34.56);
        // 返回此列表的元素数
        System.out.println(list1.size());

        // 通过索引位置来访问
        // 索引位置1
        System.out.println(list1.get(1));

        // 异常
        // System.out.println(list1.get(list1.size()));

        list1.add(0, "zhangsingerw");
        System.out.println(list1.size());

        // 删除指定位置的元素
        list1.remove(1);
        System.out.println(list1.get(1));

        // for循环遍历并输出集合的元素
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        // foreach循环遍历并输出集合的元素
        for (Object object : list1
        ) {
            System.out.println(object);
        }

        // foreach 1.8新特性
        list1.forEach(System.out::println);

    }
}
