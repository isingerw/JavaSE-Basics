package com.singerw.moinner;

public interface IFly {

    void fly();
}

class Bird implements IFly {
    @Override
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println("�����ȷ�");
    }
}

class T {
    public static void main(String[] args) {

        new IFly() {
            @Override
            public void fly() {
                System.out.println("ɵ���ȳ�");
            }
        }.fly();
//		ifly.fly();
    }
}