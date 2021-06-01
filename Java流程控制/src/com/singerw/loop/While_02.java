package com.singerw.loop;

import java.util.Scanner;

public class While_02 {
    /**
    * @Author Singerw_辛格
    * @Description //TODO
    * @Date 16:30 2021-05-11
    * @Param 让用户一直从控制台输入，直到用户输入的字符串为no的时候，结束循环
    * @return
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入字符串，输入no结束");
        String str;
        while (!"no".equals(str = input.next())){
            System.out.println(str);
        }
        System.out.println("over");
    }
}
