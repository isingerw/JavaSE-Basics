package com.singerw.box;

public class TestInt {
    public static void main(String[] args) {
        // opp语言-->万事万物皆对象
        // int 小名/昵称 ===> 简单的数学计算
        int a = 1;
        // Integer 大名
        // 可以通过引用名.属性和方法
        Integer i = 1;
        i.hashCode();

        // 字符串  ===> 转换为 int
        int n = Integer.parseInt("123");

        // 装箱
        int j = 1;
        Integer jj = j; // 基本类型可以直接赋值给包装类，这种操作叫 “装箱”
        // 拆箱
        Integer k = new Integer(1);
        int kk = k;  // Integer类型自动转换为-->int包装类型
    }


}
