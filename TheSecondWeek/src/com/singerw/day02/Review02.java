package com.singerw.day02;

import java.util.Scanner;

/**
 * @Author Singerw_辛格
 * @Description //TODO
 * @Date 9:38 2021-05-11
 * @Param
 * @return
 */
public class Review02 {
    /**
     * @return 从大到小排序
     * @Author Singerw_辛格
     * @Description //TODO
     * @Date 9:38 2021-05-11
     * @Param 输出三个整数
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入三个整数：");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int t;
        if (a < b) {
            // 交换位置，a和b的值交换了
            t = a;
            a = b;
            b = t;
        }

        if (b < c) {
            t = b;
            b = c;
            c = t;
        }

        if (a < b) {
            t = a;
            a = b;
            b = t;
        }
        System.out.println(a + ">" + b + ">" + c);
    }

}
