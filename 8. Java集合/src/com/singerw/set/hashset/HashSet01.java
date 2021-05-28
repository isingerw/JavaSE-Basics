package com.singerw.set.hashset;


import java.util.HashSet;
import java.util.Iterator;

/**
* 
* @Author 张欣
* @Date 2021-05-28 10:42
*/
public class HashSet01 {

    public static void main(String[] args) {
        HashSet set1 = new HashSet();

        // 1 添加元素（不重复）
        set1.add("tom");
        set1.add("jerry");
        set1.add("tom");

        // 2 能否为null
        // 可以
        set1.add(null);
        // 但不可重复
        set1.add(null);

        System.out.println(set1.contains("tom"));

        // 3 查看size
        System.out.println(set1.size());
        // 输出-->但不保证顺序

        // 4 获取迭代器
        Iterator itor = set1.iterator();
        System.out.println(itor);

        // itor方法 hasNext()
        while(itor.hasNext()){
            Object obj = itor.next();
            System.out.println(obj);
        }

        // 5 删除
        set1.remove(null);
        System.out.println("********************************");
        set1.iterator();
        while (itor.hasNext()){
            Object obj = itor.next();
            System.out.println(obj);
        }
    }
}
