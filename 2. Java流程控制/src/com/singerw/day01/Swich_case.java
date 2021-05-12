package com.singerw.day01;

import java.util.Scanner;

public class Swich_case {
    /**
     * @return
     * @Author Singerw_辛格
     * @Description //TODO
     * @Date 16:22 2021-05-10
     * @Param
     */
    public static void main(String[] args) {
        System.out.println("请输入月份");
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        System.out.println("请输入年份");
        int years = input.nextInt();
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(years + "年" + month + "月有31天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(years + "年" + month + "月有30天");
            case 2:
                if ((years % 4 == 0 && years % 100 != 0) || (years % 400 == 0)) {
                System.out.println(years + "年" + month + "月有29天");
            }else {
                    System.out.println(years+"年"+month+"月有28天");
                }
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
}
