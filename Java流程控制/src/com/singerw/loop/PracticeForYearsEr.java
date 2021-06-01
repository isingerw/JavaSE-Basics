package com.singerw.loop;

public class PracticeForYearsEr {
    /**
     * @Author Singerw_辛格
     * @Description //输出2000年到3000年中的闰年,要求使用for循环完成.
     * @Date 18:09 2021-05-11
     */
    public static void main(String[] args) {
        // for循环
        for (int years = 2000; years <= 3000; years++) {
            // 闰年的判断条件 能整除4且不能整除100 或 被400整除
            if ((years % 4 == 0 && years % 100 != 0) || (years % 400 == 0)) {
                System.out.println("2000年到3000年之间闰年有:" + years + "年");
            }
        }
    }
}
