package com.singerw.moinner;

public class OutClass2 {

    private static String name;

    // ��̬�ڲ���
    public static class InnerClass2 {
        public InnerClass2() {
            // ���name���ⲿ��
            name = "static : tom";
        }

        public void show() {
            System.out.println("static show:" + name);
        }
    }
}
