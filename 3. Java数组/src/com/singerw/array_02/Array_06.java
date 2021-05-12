package com.singerw.array_02;

import java.util.Scanner;

public class Array_06 {
    /**
     * @Author Singerw_辛格
     * @Description 创建一个数组
     * @Date 16:40 2021-05-12
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        System.out.println("请输入你要查找的数");
        int find = input.nextInt();
        //-1表示没找到
        int position = -1;
        // 使用循环通过索引来访问数组元素并输出
        for (int i = 0; i < array.length; i++) {
            // 比较 如果是基本类型 整数我们可以使用==
            // 如果是字符类型就要用 equals
            if (array[i] == find) {
                position = i;
                System.out.println("找到了" + find + ",索引的位置是" + position);
                break;
            }
            if (position == -1) {
                System.out.println("没找到" + find + ",尝试进行下一次寻找");
            }
        }
    }

}
