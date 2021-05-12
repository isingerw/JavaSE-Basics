package com.singerw.array_01;


public class Array_01 {
    /**
     * @Author Singerw_辛格
     * @Description //TODO
     * @Date 14:05 2021-05-12
     */
    public static void main(String[] args) {
        int [] arrayRefVar;   // 首选的方法  注意: 建议使用 dataType[] arrayRefVar 的声明风格声明数组变量。
        double arrayRefVar2[];  // 效果相同，但不是首选方法

        // 1、定义数组典型标记[] 有可能{} 声明数组并直接赋值
        double score[] = {80, 90, 85, 64, 59, 90};
        System.out.println(score.length);

        // 2、声明数组并制定长度
        double score1[] = new double[6];
        System.out.println(score1.length);
        System.out.println("第一个元素：" + score1[0] + "最后一个元素" + score1[5]);

        // 3、1+2声明数组 同时赋值，注意的是这里不需要指定长度
        double score2[] = new double[]{82, 95, 80, 85, 78, 52};

        // 声明数组
        double[] array;
        int[] array01;
        array01 = new int[]{1, 2, 3, 4, 5, 6};
    }
}
