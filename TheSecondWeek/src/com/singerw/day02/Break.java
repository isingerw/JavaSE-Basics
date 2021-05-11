package com.singerw.day02;

/**
 * @Author Singerw_辛格
 * @Description //TODO
 * @Date 13:59 2021-05-11
 * @Param
 * @return
 */
public class Break {
    /**
     * @return
     * @Author Singerw_辛格
     * @Description //TODO
     * @Date 13:59 2021-05-11
     * @Param
     */
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
            sum = sum + i;
            if (sum > 4000){
                break;
            }
        }
        System.out.println("sum" + sum);
    }
}
