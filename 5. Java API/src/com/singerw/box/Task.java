package com.singerw.box;

public class Task {
    public static void main(String[] args) {
        double i0 = 0.1;
        Double i1 = new Double(0.1);
        Double i2 = new Double(0.1);
        System.out.println("=======equals=======");
        // equals 方法在Double中有做了重写，比较的double值是否相等。
        System.out.println(i1.equals(i2));
        System.out.println(i1.equals(i0));

        System.out.println("========================");
        // new不同地址比较
        System.out.println(i1 == i2);
        // i1和直接复制比较   包装类型 、简单类型
        // 直接理解为拆箱，二者比较值是否相等。
        System.out.println(i2 == i0);

    }
}
