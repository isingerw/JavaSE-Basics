package com.singerw.set.hashset;


import java.util.HashSet;
import java.util.Iterator;

/**
* 
* @Author 张欣
* @Date 2021-05-28 10:38
*/
public class HashSet02 {

    public static void main(String[] args) {
        HashSet set1 = new HashSet();

        // 1 添加元素（不重复）
        set1.add("tom");
        set1.add("jerry");
        set1.add("tom");
        set1.add(null);

        // 4 获取迭代器
        Iterator itor = set1.iterator();
        System.out.println(itor);

        // itor方法 hasNext()
        while(itor.hasNext()){
            Object obj = itor.next();
            System.out.println(obj);
        }


    }
}
