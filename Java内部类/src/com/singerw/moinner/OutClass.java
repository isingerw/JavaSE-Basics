package com.singerw.moinner;

public class OutClass {
    private String name;

    // 成员内部类
    public class InnerClass {
        public InnerClass() {
            // 这个name是外部类
            name = "singerw";
        }

        public void show() {
            System.out.println("show:" + name);
        }
    }

    public void t() {
        int a = 1;
        // 在方法中定义一个内部类，不能使用Public
        // 方法内部类（局部内部类）
        class InnerClass1 {
            public void InnerClass1() {
                // 这个name是外部类
                name = "jerry";
            }

            public void show() {
                System.out.println("show jerry:" + name);
            }
        }
        InnerClass1 ic = new InnerClass1();
        ic.show();
    }
}
