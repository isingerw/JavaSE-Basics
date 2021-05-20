package com.singerw.day09;

public class Sub {
    public static void main(String[] args) {
        Calc calc = new Calc();
        int sum = calc.getSum(1674, 234);
        System.out.println(sum);

    }
}

class Calc {

    public int getSum(int a, int b) {
        return a + b;
    }
}
