package com.singerw.day10;

public class A {
    public A(int p) {
        System.out.println("A");
    }
}

class B extends A{
    //
    public B() {
        // 使用super来指定
        // 构造方法的调用必须出现再这个构造方法的第一行
        super(10);
        System.out.println("A");
    }
}
