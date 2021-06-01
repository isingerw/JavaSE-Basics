package com.singerw.case10;

/**
 *    蔡徐坤
 *     2-2. 创建子类,子类继承Star,重写show方法
 * @author Administrator
 *
 */
public class Dancer extends Star {
	

	@Override
	public void show(String sm) {
		System.out.println("让我们有请世界著名舞蹈家上场表演");
		System.out.println(super.getName() + "在跳 " + sm);
	}

}
