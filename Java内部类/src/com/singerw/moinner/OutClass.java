package com.singerw.moinner;

public class OutClass {
    private String name;

    // ��Ա�ڲ���
    public class InnerClass {
        public InnerClass() {
            // ���name���ⲿ��
            name = "singerw";
        }

        public void show() {
            System.out.println("show:" + name);
        }
    }

    public void t() {
        int a = 1;
        // �ڷ����ж���һ���ڲ��࣬����ʹ��Public
        // �����ڲ��ࣨ�ֲ��ڲ��ࣩ
        class InnerClass1 {
            public void InnerClass1() {
                // ���name���ⲿ��
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
