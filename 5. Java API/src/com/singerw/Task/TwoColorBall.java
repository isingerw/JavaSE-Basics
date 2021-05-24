package com.singerw.Task;

public class TwoColorBall {
    /**
     * 双色球每注投注号码由6个红色球号码和1个蓝色球号码组成。
     * 红色球号码从1--33中选择；
     * 蓝色球号码从1--16中选择。
     * 注需要选择6个红色球号码，1个蓝色球号码。
     *
     * @param color
     * @param quantity
     * @param scope
     */
    public void randomGeneration(String color, int quantity, int scope) {
        //返回的球的号码
        int[] ballNumber = new int[quantity];
        for (int i = 0; i < ballNumber.length; i++) {
            int number = (int) (Math.random() * scope + 1);
            for (int j = 0; j < i; j++) {
                if (number == ballNumber[j]) {
                    number = (int) (Math.random() * scope + 1);
                    j = 0;
                }
            }
            ballNumber[i] = number;
        }
        System.out.print(color + "开奖号码为：");
        for (int i = 0; i < ballNumber.length; i++) {
            System.out.print("\t" + ballNumber[i]);
        }
    }
}
