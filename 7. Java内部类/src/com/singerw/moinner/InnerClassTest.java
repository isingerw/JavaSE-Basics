package com.singerw.moinner;

public class InnerClassTest {
    public static void main(String[] args) {
        OutClass outClass = new OutClass();
        OutClass.InnerClass innerClass = outClass.new InnerClass();
        innerClass.show();
    }
}
