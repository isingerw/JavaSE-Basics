package com.singerw.day01;


import java.util.Scanner;

public class Work01 {
    /**
    * @Author Singerw_辛格
    * @Description //TODO
    * @Date 10:29 2021-05-10
    * @Param 控制台输入两个数，交换输出方案1
    * @return
    */
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入两个数：");
        a = input.nextInt();
        b = input.nextInt();
        System.out.println("交换前" + a);
        System.out.println("交换前" + b);
        //方案1
        int c;
        c = a;
        a = b;
        b = c;
        System.out.println("交换后" + a);
        System.out.println("交换后" + c);

    }
}
