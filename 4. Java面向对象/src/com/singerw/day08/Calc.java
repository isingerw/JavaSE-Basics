package com.singerw.day08;

/**
 * @ClassName: Calc
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author 张欣
 * @Date 2021-05-14 15:09
 */
public class Calc {
    /**
     * (求和运算)
     *
     * @param
     * @param
     */
    public void add(int a, int b) {
        System.out.println("和为：" + (a + b));
    }

    /**
     * (求差运算)
     *
     * @param a
     * @param b
     */
    public void sub(int a, int b) {
        System.out.println("差为：" + (a - b));
    }

    /**
     * (乘积运算)
     *
     * @param
     * @param
     */
    public int mul(int a, int b) {
        int sum = a * b;
        // return 从方法中返回结果给调用
        return sum;
    }

    /**
     * (这里用一句话描述这个构造函数的作用)
     *
     * @param
     * @Return
     */
    public void swap(int a, int b) {
        int t = a;
        a = b;
        b = t;
        System.out.println("swap a:" + a + "b:" + b);
    }
}
