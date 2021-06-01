package com.singerw.case10;

/**
 * 宝国
 *  2-3. 创建子类,子类继承Star,重写show方法
 * @author Administrator
 *
 */
public class Rapper extends Star {

	@Override
	public void show(String sm) {
		System.out.println("让我们有收钱的男神上场表演");
		System.out.println(super.getName()+ "在" + sm);
	}
}
