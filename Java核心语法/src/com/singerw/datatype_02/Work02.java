package com.singerw.datatype_02;

import java.util.Scanner;

public class Work02 {
    /*
     * @Author Singerw_辛格
     * @Description //TODO
     * @Date 20:05 2021-05-08
     * @Param
     * @return
     **/
    public static void main(String[] args) {

        //两个变量的值是从控制台输入进来的
        int a,b;
        //输入方式是用到Java中工具类Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("请输入两个整数");

        a = input.nextInt();
        b = input.nextInt();

        //输出和差积商
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    }
}
