package com.singerw.ArrayTask;

public class ArrayTaskFibonacci {
    /**
     * @Author Singerw_辛格
     * @Date 20:35 2021-05-13
     * 输出斐波那契数列的20项
     */
    public static void main(String[] args) {
        // 定义数组
        int[] numberArray = new int[20];

        // 给第一项与第二项赋值
        numberArray[0] = 0;
        numberArray[1] = 1;

        // 组成数组
        for (int i = 2; i < numberArray.length; i++) {
            numberArray[i] = numberArray[i - 1] + numberArray[i - 2];
        }

        // 遍历打印输出
        for (int n : numberArray) {
            System.out.println(n);
        }
    }
}
