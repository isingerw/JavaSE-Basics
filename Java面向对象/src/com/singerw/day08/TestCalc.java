package com.singerw.day08;

/**
 * @ClassName: TestCalc
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author 张欣
 * @Date 2021-05-14 15:11
 */
public class TestCalc {
    public static void main(String[] args) {

        // 创建对象
        Calc calc = new Calc();
        // 调用方法
        calc.add(10, 2);
        calc.sub(2, 6);


        // 如果方法有返回值，要接收mul的返回值 定义一个合适的类型接收返回值
        // 函数 和 方法是同一个东西
        int result = calc.mul(6, 5);
        System.out.println(result);

        int a = 1, b = 2;
        calc.swap(a, b);
        System.out.println("main:  a:" + a + "b:" + b);
    }
}
