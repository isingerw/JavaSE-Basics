package com.singerw.day01;

import java.util.Scanner;

public class Work02 {
    /**
    * @Author Singerw_辛格
    * @Description //TODO
    * @Date 10:34 2021-05-10
    * @Param 控制台输入两个数，交换输出方案2
    * @return
    */
    public static void main (String[] args){
        int a,b;
        // 控制台输入
        Scanner input = new Scanner(System.in);
        a = input.nextInt(); // 100
        b = input.nextInt(); //1
        System.out.println("交换前" + a);
        System.out.println("交换前" + b);
        //定义a+b的和存放在a中
        a = a+b; // 101
        // b还是b,a是a+b的和，所以a-b就是原来的a，将原来a的值赋值给b；
        b = a-b; // 101-1 = 100
        // b已经是原来的a,a是a+b的和，所以a-b就是原来的b，将原来b的值赋值给a；实现交换
        a = a-b; // 101-100 = 1
        System.out.println("交换后" + a);
        System.out.println("交换后" + b);
    }
}
