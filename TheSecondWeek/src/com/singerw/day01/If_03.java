package com.singerw.day01;

import java.util.Scanner;

public class If_03 {
    /**
     * @return
     * @Author Singerw_辛格
     * @Description //TODO
     * @Date 13:50 2021-05-10
     * @Param 求三个数中的最大值
     */
    public static void main(String[] args) {
        int a, b, c;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        int max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (max < c) {
            max = c;
        }
        System.out.println("三个数字：" + a + "," + b + "," + c + "中的最大值为" + max);
    }
}
