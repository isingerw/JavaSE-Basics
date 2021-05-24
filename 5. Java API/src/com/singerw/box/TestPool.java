package com.singerw.box;

public class TestPool {
    public static void main(String[] args) {
        // 池技术，直接复制存储在内存逻辑区  --》 方法区  --》 常量池
        Integer i1 = 20;
        Integer i2 = 20;
        // 所以我们说,i1和i2只想的数据地址是相同的。
        System.out.println("i1 == i2 " + (i1 == i2));

        // 而每次new操作，new对象是堆在存储的，地址一定不同。
        Integer i3 = new Integer(20);
        Integer i4 = new Integer(20);
        System.out.println("i3 == i4 " + (i3 == i4));
    }

}
