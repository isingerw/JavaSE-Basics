package com.singerw.review;

import com.singerw.demogen.Goods;

import java.util.Comparator;

public class IDComp implements Comparator<Goods> {

	@Override
	public int compare(Goods o1, Goods o2) {
		// TODO Auto-generated method stub
		return o1.getId() - o2.getId();
	}
	

}
