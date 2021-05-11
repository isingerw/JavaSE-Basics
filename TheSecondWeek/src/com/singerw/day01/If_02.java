package com.singerw.day01;

import java.util.Scanner;
/**
* @Author Singerw_辛格 
* @Description //TODO 
* @Date 13:53 2021-05-10
* @Param
* @return  
*/
public class If_02 {
    /**
     * @return
     * @Author Singerw_辛格
     * @Description //TODO
     * @Date 11:26 2021-05-10
     * @Param
     */
    public static void main(String[] args) {
        int a, b;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
