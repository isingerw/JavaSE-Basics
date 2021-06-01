package com.singerw.loop;

public class Debug_02 {
    /**
     * @return
     * @Author Singerw_辛格
     * @Description //TODO
     * @Date 15:43 2021-05-11
     * @Param
     */
    public static void main(String[] args) {
        double height = 100;
        double sum = 0;
        for (int i = 1; i <= 10; i++) {
            // 累加落下的高度
            sum = sum + height;
            // 弹起一半
            height = height / 2;
            // 累加弹起的高度
            sum = sum +height;

            System.out.println(height);
            System.out.println(sum);
        }
    }
}
