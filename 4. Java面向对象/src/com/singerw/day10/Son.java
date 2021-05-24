package com.singerw.day10;

public class Son extends Father {
    public static void main(String[] args) {

    }

    // super关键字一定出现在子类方法，调用父类的属性或者方法
    public void test1() {
        super.t();  // 如果不加super，默认找当前类的方法t()，如果不存在的话，再去调用父类的t()方法
    }
}
