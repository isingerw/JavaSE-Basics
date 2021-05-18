package com.singerw.day08;

/**
 * @ClassName: Calc
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author 张欣
 * @Date 2021-05-14 15:09
 */
public class Calc {
    // a b 称之为参数，是方法执行的必备条件
    // 不能确定a b的值，所以a b为形式参数
    /**
     * (这里用一句话描述这个构造函数的作用)
     * @param a
     * @param b
     * @Return
     */
    public void add(int a, int b) {
        System.out.println("和为：" + (a + b));
    }


    public void sub(int a, int b) {
        System.out.println("差为：" + (a - b));
    }

    // 乘法运算
    public int mul(int a, int b) {
        int sum = a * b;
        // return 从方法中返回结果给调用
        return sum;
    }

    /**
     *
     * @param a
     * @param b
     */
    public void swap(int a, int b) {
        int t = a;
        a = b;
        b = t;
        System.out.println("swap a:" + a + "b:" + b);
    }
}
