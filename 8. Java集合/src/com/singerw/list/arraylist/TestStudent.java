package com.singerw.list.arraylist;

import java.util.ArrayList;

public class TestStudent {
    /**
     * @Author CodeSleep
     * @Description (这里用一句话描述这个方法用来做什么)
     * @Date 2021-05-29 0:47
     * @param args
     */
    public static void main(String[] args) {
        //1-> 数组一旦长度可变.
        //2->提供很多的固定算法。直接调用. 插入，添加到尾部，排序，查找等等

        ArrayList<Student> list = new ArrayList();
        Student s1 = new Student("tom", 20);
        Student s2 = new Student("jerry", 21);
        Student s3 = new Student("singer",23);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        System.out.println(list.size());

        System.out.println(list.get(2));

        list.remove(2);
        System.out.println(list.size());

        //遍历输出
        list.forEach(System.out::println);
    }

}
