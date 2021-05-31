package com.singerw.arrays.demo;

import java.util.Arrays;

/**
 * @ClassName: MyComparator01Test
 * @Description: //TODO 外部比较器测试类
 * @Author: CodeSleep
 * @Date: 2021-05-31 15:04
 * @Version: 1.0
 */
class MyComparator01Test {
    public static void main(String[] args) {
        String[] array = {"6", "12", "23", "23", "32"};
        Arrays.parallelSort(array, new MyComparator01());
        for (String i : array) {
            System.out.println(i);
        }
    }
}