package com.singerw.moinner;


class OutClass2Test {
    public static void main(String[] args) {
        // 静态内部类
        // 外部类.内部类 引用名 = new 外部类.内部类()
        OutClass2.InnerClass2 i2 = new OutClass2.InnerClass2();
        i2.show();
    }
}