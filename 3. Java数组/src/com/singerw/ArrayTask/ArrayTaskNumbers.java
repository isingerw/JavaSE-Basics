package com.singerw.ArrayTask;

import java.util.Scanner;

public class ArrayTaskNumbers {
    /**
     * @Author Singerw_辛格
     * @Date 20:21 2021-05-13
     * 输入10个整数，按照从小到大进行排序
     * 1. 控制台输入
     * 2. 冒泡排序
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 定义数组，for循环完成控制台输入
        int[] numberArray = new int[10];
        for (int i = 0; i < numberArray.length; i++) {
            System.out.print("请输入第" + (i + 1) + "个整数：");
            numberArray[i] = input.nextInt();
        }
        // for循环完成比较，比较的轮次为数组长度-1；
        for (int i = 0; i < numberArray.length - 1; i++) {
            for (int j = 0; j < numberArray.length - i - 1; j++) {
                if (numberArray[j] > numberArray[j + 1]) {
                    int a = numberArray[j];
                    numberArray[j] = numberArray[j + 1];
                    numberArray[j + 1] = a;
                }
            }
        }
        // 遍历打印结果
        for (int n : numberArray) {
            System.out.println(n);
        }
    }
}
