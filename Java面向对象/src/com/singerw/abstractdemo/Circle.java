package com.singerw.abstractdemo;

public class Circle extends Shape {

    // ¸ù¾Ý°ë¾¶
    private double r;

    public Circle(double r) {
        super();
        this.r = r;
    }

    @Override
    public double getArea() {
        // TODO Auto-generated method stub
        return Math.PI * r * r;
    }

}
