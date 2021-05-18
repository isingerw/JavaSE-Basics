package com.singerw.case10;

/**
 * 伍佰
 * 2-1. 创建子类,子类继承Star,重写show方法
 * 
 * @author Administrator
 *
 */
public class Singer extends Star {

	@Override
	public void show(String sm) {
		System.out.println("让我们有请世界著名歌星上场表演");
		// super.getName() 调用父类的getName方法获取name
		System.out.println(super.getName() + " 在唱 :" + sm);
	}

}
