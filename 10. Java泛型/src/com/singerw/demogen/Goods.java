package com.singerw.demogen;

public class Goods implements Comparable<Goods> {

	@Override
	public int compareTo(Goods o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	private int id;
	private double price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
