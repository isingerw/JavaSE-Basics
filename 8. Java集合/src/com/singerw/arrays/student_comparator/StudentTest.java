package com.singerw.arrays.student_comparator;


import java.util.Arrays;

class StudentTest {
    public static void main(String[] args) {
        Student xb = new Student(1, "小白", 20);
        Student xh = new Student(1, "小黑", 18);
        Student xl = new Student(1, "小绿", 2);

        // 数组存放数据
        Student[] array = {xb, xh, xl};
        // 排序
        for (Student student : array) {
            System.out.println(student);
        }
        System.out.println("*************");
        // 按照年龄从小到大
        Arrays.sort(array, new AgeComparator());
        // 自定义比较器使用之后
        for (Student student : array) {
            System.out.println(student);
        }

        // 按照id从小到大
        Arrays.sort(array, new IdComparator());
        // 自定义比较器使用之后
        for (Student student : array) {
            System.out.println(student);
        }
    }
}