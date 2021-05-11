package com.singerw.day02;

/**
* @Author Singerw_辛格
* @Description //TODO
* @Date 16:48 2021-05-11
*/
public class While05_BallEr {
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
        int i = 1;
        while (i <= 10) {
            // 累加落下的高度
            sum = sum + height;
            // 弹起一半
            height = height / 2;
            // 累加弹起的高度
            sum = sum + height;

            System.out.println(height);
            System.out.println(sum);
            i++;
        }
    }
}
