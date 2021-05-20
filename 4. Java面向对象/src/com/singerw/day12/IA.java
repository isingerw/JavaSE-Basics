package com.singerw.day12;


/**
* @ClassName: IA
* @Description: TODO(这里用一句话描述这个类的作用)
* @Author 张欣
* @Date 2021-05-20 9:47
*/
public interface IA {
    // 1公共常量
    int a = 2; // a 要赋值才能定义使用
    final int b =2;
    static final int c = 2;
    public static final int d = 2;

    // 2抽象方法
    public abstract void t1();
    abstract void t2();
    void t3();

    // 3默认方法
    default void t4(){
        System.out.println("jdk1.8 default method");
    }
}
