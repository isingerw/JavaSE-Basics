package com.singerw.ArrayTask;

import java.util.Scanner;

public class ArrayTaskClass {
    /**
     * @Author Singerw_辛格
     * @Description //TODO
     * @Date 17:27 2021-05-12
     * 录入班级5名的姓名，查找是否包含某个学生，输出结果.
     * 1、定义字符串数组，使用循环完成输入.
     * 2、for循环遍历数组元素，使用equals完成比较。
     * 3、输出结果，显示是否找到，并给出位置.
     */
    public static void main(String[] args) {
        // 从控制台输入学生姓名
        Scanner input = new Scanner(System.in);
        // 创建数组
        String[] nameArray = new String[5];
        for (int i = 0; i < nameArray.length; i++) {
            System.out.print("请输入第" + (i + 1) + "个学生的姓名：");
            // 接收从控制台输入的姓名存至数组中
            nameArray[i] = input.next();
        }

        System.out.print("请输入你要查找的学生姓名：");
        String find = input.next();
        // 定义position赋值为-1，-1表示没找到
        int position = -1;
        for (int i = 0; i < nameArray.length; i++) {
            // 条件比较，字符串类型用equals
            // 如果find的值等于数组中i的值，则说明成功找到
            if (find.equals(nameArray[i])) {
                position = i;
                System.out.println("找到了学生：" + find + ",该学生的索引位置是" + position);
            }
        }
        // 如果find的值等于-1，则说明没找到
        if (position == -1) {
            System.out.println("没找到：" + find + "，正在尝试下一次寻找");
    }
}
}
