package com.singerw.array_02;

import java.util.Scanner;

public class Array_04 {
    /**
     * @Author Singerw_辛格
     * @Description //控制台输入数字存入数组，求和与平均数
     * @Date 15:32 2021-05-12
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("和是：" + sum);
        System.out.println("平均数是：" + sum / array.length);
    }
}
