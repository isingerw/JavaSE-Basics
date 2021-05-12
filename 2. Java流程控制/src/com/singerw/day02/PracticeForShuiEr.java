package com.singerw.day02;

public class PracticeForShuiEr {
    /**
     * @Author Singerw_辛格
     * @Description //判断100到500之间，哪些数是水仙花数
     * @Date 18:09 2021-05-11
     */
    public static void main(String[] args) {
        // 定义变量和
        int sum = 0;
        // for 循环
        for (int i = 100; i < 500; i++) {
            // 定义个位十位百位
            int g = i % 10;
            int s = i / 10 % 10;
            int b = i / 100 % 10;
            // 条件判断，个位十位百位的三次方之和等于 i
            if (g * g * g + s * s * s + b * b * b == i) {
                System.out.println("100到500之间的水仙花数有：" + i);
            }
        }
    }
}
