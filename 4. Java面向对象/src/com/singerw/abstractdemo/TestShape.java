package com.singerw.abstractdemo;

public class TestShape {

	public static void main(String[] args) {
		
		//Բ�����
		Shape s1 = new Circle(3);
		System.out.println(s1.getArea());
		
		//������
		Shape s2 = new Square(3);
		System.out.println(s2.getArea());

	}
}
