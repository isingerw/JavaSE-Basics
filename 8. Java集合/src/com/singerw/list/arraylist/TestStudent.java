package com.singerw.list.arraylist;

import java.util.ArrayList;

public class TestStudent {
    /**
     * @Author CodeSleep
     * @Description (������һ�仰�����������������ʲô)
     * @Date 2021-05-29 0:47
     * @param args
     */
    public static void main(String[] args) {
        //1-> ����һ�����ȿɱ�.
        //2->�ṩ�ܶ�Ĺ̶��㷨��ֱ�ӵ���. ���룬��ӵ�β�������򣬲��ҵȵ�

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

        //�������
        list.forEach(System.out::println);
    }

}
