package com.singerw.abstractdemo;

public class TestShape {

	public static void main(String[] args) {
		
		//圆形面积
		Shape s1 = new Circle(3);
		System.out.println(s1.getArea());
		
		//正方形
		Shape s2 = new Square(3);
		System.out.println(s2.getArea());

	}
}
