package com.singerw.day01;

import java.util.Scanner;

/**
 * @Author Singerw_辛格
 * @Description //TODO
 * @Date 14:12 2021-05-10
 * @Param
 * @return
 */
public class If_04 {
    /**
     * @return
     * @Author Singerw_辛格
     * @Description //TODO
     * @Date 14:13 2021-05-10
     * @Param
     */
    public static void main(String[] args) {
        System.out.println("请输入月份（1-12月份）");
        Scanner input = new Scanner(System.in);

        int month = input.nextInt();
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("这个月有31天");
        } else if (month == 2) {
            System.out.println("这个月有28/29天");
        } else {
            System.out.println("这个月有30天");
        }
    }
}
