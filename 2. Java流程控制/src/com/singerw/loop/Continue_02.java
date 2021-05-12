package com.singerw.loop;

/**
 * @Author Singerw_辛格
 * @Description //TODO
 * @Date 14:19 2021-05-11
 * @Param
 * @return
 */
public class Continue_02 {
    /**
     * @return
     * @Author Singerw_辛格
     * @Description //TODO
     * @Date 14:19 2021-05-11
     * @Param continnue 应用，1-100累加，跳过3或5的倍数
     */
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                continue;
            }
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
