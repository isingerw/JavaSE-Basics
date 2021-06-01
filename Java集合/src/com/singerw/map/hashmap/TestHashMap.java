package com.singerw.map.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: TestHashMap
 * @Description: //TODO 类描述
 * @Author: CodeSleep
 * @Date: 2021-05-31 10:08
 * @Version: 1.0
 */
public class TestHashMap {
    public static void main(String[] args) {
        // 接口引用 = 实现类对象
        Map map = new HashMap();

        // 类引用 = 类对象
        HashMap hashMap = new HashMap();

        // 1 添加元素
        hashMap.put("1", "singer");
        hashMap.put("2", "image.singerw.com");
        hashMap.put("3", "singer.com");
        // 2 获取元素，通过key得到V
        System.out.println(hashMap.get("1"));

        // 3 添加一重复的key会覆盖原来存在的那个value
        hashMap.put("1", "zhangsingerw");
        System.out.println(hashMap.get("1"));

        //4 size element个数
        System.out.println(hashMap.size());

        // 5 键集 值集 键值合集
        System.out.println("keySet:" + hashMap.keySet());
        System.out.println("values" + hashMap.values());
        System.out.println("entrySet" + hashMap.entrySet());

        // 6 遍历得到键
        for (Object o : hashMap.keySet()) {
            System.out.println("keySet" + o);
        }

        // 7 遍历得到值
        for (Object o : hashMap.values()) {
            System.out.println("values" + o);
        }

        // 8 查询 contains
        System.out.println("containsKey:" + hashMap.containsKey("1"));
        System.out.println("containsValue" + hashMap.containsValue("singer.com"));

        // 9 删除
        System.out.println(hashMap.remove("1"));
        System.out.println(hashMap.containsKey("1"));
    }
}
