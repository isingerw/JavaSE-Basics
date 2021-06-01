package com.singerw.throwdemo;

/**
 * @ClassName: ThrowDemo
 * @Description: //TODO 类描述
 * @Author: CodeSleep
 * @Date: 2021-06-01 16:22
 * @Version: 1.0
 */
public class ThrowDemo {
    public static void main(String[] args) {
        f();
    }

    public static void f(){
        try {
            throw new RuntimeException("抛出一个异常");
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
}
