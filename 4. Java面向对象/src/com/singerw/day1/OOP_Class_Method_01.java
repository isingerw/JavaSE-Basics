package com.singerw.day1;

import java.util.Scanner;

public class OOP_Class_Method_01 {
    /**
    * @Author Singerw_辛格
    * @Description //TODO
    * @Date 13:55 2021-05-14
    */
    public static void main(String[] args) {
        //调用method01


    }
    /**
    * @Author Singerw_辛格
    * 定义method01方法
    * @Date 13:55 2021-05-14
    */
    public  void method01() {
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

