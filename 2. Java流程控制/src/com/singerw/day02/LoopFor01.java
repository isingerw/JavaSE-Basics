package com.singerw.day02;

/**
 * @Author Singerw_辛格
 * @Description //TODO
 * @Date 10:20 2021-05-11
 * @Param
 * @return
 */
public class LoopFor01 {

    /**
     * @return
     * @Author Singerw_辛格
     * @Description //TODO
     * @Date 10:20 2021-05-11
     * @Param
     */
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum+i;
            System.out.println("第" + i + "次：" + i);
        }
        System.out.println("和为"+sum);
    }
}
