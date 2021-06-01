package com.singerw.array_03;

import java.util.Scanner;

public class Array_02 {
    /**
    * @Author Singerw_辛格
    * @Description //TODO
    * @Date 14:06 2021-05-13
    */
    public static void main(String[] args) {
        double score[][] = new double[20][20];
        Scanner input = new Scanner(System.in);
        System.out.println(score.length);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第"+(i+1)+"门");
            for (int j = 0; j < 2; j++) {
                System.out.println("请输入第"+(j+1)+"个学生的成绩");
                score[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(score[i][j]);
            }
        }
    }
}
