package com.singerw.abstractdemo;

public class Square extends Shape {

	// ���ݱ߳�
	private double side;

	public Square(double side) {
		super();
		this.side = side;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return side * side;
	}

}
