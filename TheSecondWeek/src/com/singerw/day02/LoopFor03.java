package com.singerw.day02;

import java.util.Scanner;

/**
 * @Author Singerw_辛格
 * @Description //TODO
 * @Date 10:48 2021-05-11
 * @Param
 * @return
 */
public class LoopFor03 {

    /**
     * @return  返回1+2+3+4+...n的偶数和
     * @Author Singerw_辛格
     * @Description //TODO
     * @Date 10:46 2021-05-11
     * @Param 控制台输入n
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int n = input.nextInt();
        int sum = 0;
        if (n < 1) {
            System.out.println("请输入大于1的整数");
        } else {
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    sum = sum + i;
                }
            }
            System.out.println(sum);
        }
    }
}
