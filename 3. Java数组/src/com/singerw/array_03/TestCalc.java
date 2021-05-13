package com.singerw.array_03;

public class TestCalc {
    public static void main(String[] args) {

        //单精度或者双精度浮点型 ==
        double a = 0.5;
        double b = 0.5;
        System.out.println(a == b); // 0.5二进制 == 0.5二进制
        //

        // 小数-》乘以2 取整  0.5*2 =1
        System.out.println("**************");
        double e = 0.5d;
        float f = 0.5f;
        System.out.println(e == f);

        System.out.println("**************");
        double c = 0.3d;// 0.3*2->0.6 *2=>0.2*2=>0.4*2=>0.8=>*2=>0.6*2=>0.2
        //double d = 0.3d;
        float d = 0.3f; //0.3*2->0.6 *2=>0.2*2=>0.4*2=>0.8=>*2=>0.6*2=>0.2

        System.out.println(c == d);// 无法完全计算完整的，精度会有一定损失，这里false
        System.out.println("**************");

    }
}
