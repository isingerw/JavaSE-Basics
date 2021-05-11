package com.singerw.day03;

import java.util.Scanner;

public class Work03 {
    /*
     * @Author Singerw_辛格
     * @Description //TODO
     * @Date 20:19 2021-05-08
     * @Param
     * @return
    **/
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个五位数整数");
        a = input.nextInt();

        int g = a%10;
        int s = a/10%10;
        int b = a/100%10;
        int q = a/1000%10;
        int w = a/10000%10;

        int sum =  g + s + b + q + w;
        System.out.println(sum);
    }
}
