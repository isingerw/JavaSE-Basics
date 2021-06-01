package com.singerw.ArrayTask;

import java.util.Scanner;

public class ArrayTaskStudent {
    /**
     * @Author Singerw_辛格
     * @Description //TODO
     * @Date 17:31 2021-05-12
     * 录入10个学生的年龄，按照从小到大排序输出。
     * 1、定义整型数组，使用循环完成输入
     * 2、使用for循环完成选择排序
     * 3、输出排序后的结果
     */
    public static void main(String[] args) {
        int smaller = 0;
        // 定义Scanner从控制台输入学生年龄
        Scanner input = new Scanner(System.in);
        // 创建数组
        int[] ageArray = new int[10];
        for (int i = 0; i < ageArray.length; i++) {
            System.out.print("请输入第" + (i + 1) + "个学生的年龄：");
            // 接收从控制台输入的姓名存至数组中
            ageArray[i] = input.nextInt();
        }

        for (int j = 0; j < ageArray.length - 1; j++) {
            // 自定义的smaller当做最小值
            smaller = j;
            // 比较，用当前的索引值和数组中剩余的每一个元素都比较一次
            for (int k = j + 1; k < ageArray.length; k++) {
                // 条件比较
                if (ageArray[smaller] > ageArray[k]) {
                    smaller = k;
                }
            }
            // 得到最小值的所在位置，所以位置至smaller
            if (smaller != j) {
                // 交换
                int temp = ageArray[smaller];
                ageArray[smaller] = ageArray[j];
                ageArray[j] = temp;
            }
        }
        // 输出结果
        System.out.println("学生年龄按照从小到大为：");
        for (int ascending : ageArray) {
            System.out.println(ascending);
        }
    }
}
