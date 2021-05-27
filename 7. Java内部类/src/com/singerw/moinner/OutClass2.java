package com.singerw.moinner;

public class OutClass2 {

    private static String name;

    // 静态内部类
    public static class InnerClass2 {
        public InnerClass2() {
            // 这个name是外部类
            name = "static : tom";
        }

        public void show() {
            System.out.println("static show:" + name);
        }
    }
}
