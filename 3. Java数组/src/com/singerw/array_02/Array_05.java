package com.singerw.array_02;

import java.util.Scanner;

public class Array_05 {
    /**
     * @Author Singerw_辛格
     * @Description //控制台输入数字存入数组，求最大值最小值
     * @Date 16:05 2021-05-12
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        // 最大值
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        // 最小值
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i]<min){
                min = array[i];
            }
        }
        System.out.println("最大值是：" + max);
        System.out.println("最小值是：" + min);
    }
}
