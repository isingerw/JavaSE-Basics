package com.singerw.review;

import com.singerw.demogen.Goods;

import java.util.Comparator;

public class PriceComp2 implements Comparator<Goods> {

	@Override
	public int compare(Goods o1, Goods o2) {
		// TODO Auto-generated method stub
		return (int) (o1.getPrice() - o2.getPrice());
	}

}
