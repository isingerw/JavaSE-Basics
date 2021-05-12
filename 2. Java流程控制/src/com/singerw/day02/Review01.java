package com.singerw.day02;

import java.util.Scanner;

/**
 * @Author Singerw_辛格
 * @Description //TODO
 * @Date 9:15 2021-05-11
 * @Param
 * @return
 */
public class Review01 {
    /**
     * @Author Singerw_辛格
     * @Description //TODO
     * @Date 9:15 2021-05-11
     * @Param 输出三个整数
     * @return 从大到小排序
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入三个整数：");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // 最土，最麻烦方法
        if (a > b && b > c) {
            System.out.println(a + ">" + b + ">" + c);
        } else if (a > c && c > b) {
            System.out.println(a + ">" + c + ">" + b);
        } else if (b > a && a > c) {
            System.out.println(b + ">" + a + ">" + c);
        } else if (b > c && c > a) {
            System.out.println(b + ">" + c + ">" + a);
        } else if (c > a && a > b) {
            System.out.println(c + ">" + a + ">" + b);
        } else if (c > b && b > a) {
            System.out.println(c + ">" + b + ">" + a);
        }
    }
}
