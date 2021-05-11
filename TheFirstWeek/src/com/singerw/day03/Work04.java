package com.singerw.day03;

import java.util.Scanner;

public class Work04 {
    /*
     * @Author Singerw_辛格
     * @Description //TODO
     * @Date 20:23 2021-05-08
     * @Param
     * @return
    **/
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个整数");

        a = input.nextInt();
        int g = a % 10;
        int s = a /10 % 10;
        int b = a /100 %10;
        int sum = g*g*g+s*s*s+b*b*b;
        String info = sum == a?"数字"+a+"是水仙花数":"数字"+a+"不是水仙花数";
        System.out.println(info);

    }

}
