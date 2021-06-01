package com.singerw.day07;

/**
 * @ClassName: TestClass_04
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author 张欣
 * @Date 2021-05-14 15:23
 */
public class TestClass_04 {
    /**
     * (这里用一句话描述这个构造函数的作用)
     * @param
     * @Return
     */
    public static void main(String[] args) {
        // 使用OOP_Class_04类的方法，先创建类对象
        // 类名 引用名= nwe 类名
        OOP_Class_04 number = new OOP_Class_04();
        number.number1(123);
        int n = 242;
        boolean flag =  number.number2(n);
        if (flag) {
            System.out.println(n + "是质数");
        }else {
            System.out.println(n + "不是质数");
        }
    }

}
