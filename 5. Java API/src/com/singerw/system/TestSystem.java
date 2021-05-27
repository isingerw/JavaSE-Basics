package com.singerw.system;

import java.util.Scanner;

public class TestSystem {
    public static void main(String[] args) {
        // 输出
        System.err.println("abc");
        System.out.println("abc");
        // 输入
        Scanner input = new Scanner(System.in);

        // 常见的方法
        // 1 运行垃圾回收器
        System.gc();
        // 2 当前实际毫秒值(当前时间 举例1970-1-1的差值)
        System.out.println(System.currentTimeMillis());
        // 3 退出 终止虚拟机,通常用来结束程序
        System.exit(0);
        System.out.println("over");
    }
}
