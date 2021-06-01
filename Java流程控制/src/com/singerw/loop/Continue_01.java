package com.singerw.loop;

/**
 * @Author Singerw_辛格
 * @Description //TODO
 * @Date 14:06 2021-05-11
 * @Param
 * @return
 */
public class Continue_01 {
    /**
     * @return
     * @Author Singerw_辛格
     * @Description //TODO
     * @Date 14:06 2021-05-11
     * @Param
     */
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            if (i % 5 ==0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
}
