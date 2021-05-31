package com.singerw.xianchengtongbu;

import java.util.Vector;

/**
 * @ClassName: ThreadDemo
 * @Description: //TODO 类描述
 * @Author: CodeSleep
 * @Date: 2021-05-31 13:55
 * @Version: 1.0
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Vector vector = new Vector();
        // public synchronized boolean add(E e)
        // synchronized 线程同步
        // synchronized方法 关键字，有的话一定是线程安全的，没有的话不确定。
        vector.add("");
    }

}
