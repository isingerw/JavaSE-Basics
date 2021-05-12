package com.singerw.loop;

import java.util.Scanner;

/**
 * @Author Singerw_辛格
 * @Description //TODO
 * @Date 10:20 2021-05-11
 * @Param 从控制台输入一个数字n
 * @return 求1+2+3+4+...n的和
 */
public class LoopFor_02 {

    /**
     * @return
     * @Author Singerw_辛格
     * @Description //TODO
     * @Param 从控制台输入一个数字n
     * @return   求1+2+3+4+...n的和
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int n = input.nextInt();
        if (n < 1) {
            System.out.println("请输入大于1的整数");
        } else {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum = sum + i;
            }
            System.out.println("sum=" + sum);
        }
    }
}
