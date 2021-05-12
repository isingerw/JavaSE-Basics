package com.singerw.day01;
/**
* @Author Singerw_辛格 
* @Description //TODO 
* @Date 23:07 2021-05-09
* @Param 文档注释[类前或者 方法前] 注释是一种规范 这个类只是一个测试类...
* @return  
*/
public class Work02 {
    /**
    * @Author Singerw_辛格 
    * @Description //TODO 
    * @Date 23:07 2021-05-09
    * @Param 方法前注释
    * @return  
    */
    public static void main(String[] args) {
        // 1- 声明变量（告知这个变量的数据类型） a
        // 2- 赋值为1
        int a = 1;
        // 定义变量b并赋值为2
        int b = 2;
        System.out.println("********交换前***********");
        System.out.println(a);
        System.out.println(b);
        // 交换a和b的值; 解决方案 ： 使用临时变量(空杯子)
        // 步骤1 将a的值赋给c
        int c = a;
        // 步骤2 将b的值 赋给a
        a = b;
        // 步骤3 将c的值 赋给 b
        b = c;
        System.out.println("********交换后***********");
        System.out.println(a);
        System.out.println(b);
    }
}
