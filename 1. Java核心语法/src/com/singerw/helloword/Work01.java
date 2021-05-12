package com.singerw.helloword;

public class Work01 {
    /*
     * @Author Singerw_辛格
     * @Description //TODO
     * @Date 22:49 2021-05-09
     * @Param
     * @return
    **/
    public static void main(String[] args) {
        // 定义一个整型变量
        // a 称为变量名
        // 1 通常有字母 数字 下划线和 $ 符号组成，不能重复
        // 2 不能以数字开头
        // 3 不能是java中关键字，在相同作用域内不能重复
        int a = 12;     // 变量，a的值是可以随时改变的
        a = a + 1;      //a = a + 1 先计算a+1 =》12+1  =》 a = 13
        System.out.println(a + 1);

        final int b = 12;   //final为常量，在程序运行过程中，值u不能改变

//        b = b + 1;
//        final double d = 3.14;
//        d = d+1;
    }
}
