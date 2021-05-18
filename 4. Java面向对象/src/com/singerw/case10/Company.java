package com.singerw.case10;

/**
 * 受钱 演艺公司，邀请一些艺人来表演;
 *  3. 类中有一个方法，方法的参数是父类引用;
 * @author Administrator
 *
 */
public class Company {

	// 设计艺人来表演节目
//	public void perform(Singer singer) {
//		singer.show("突然的自我");
//	}
//	// 设计艺人来表演节目
//	public void perform(Dancer dancer) {
//		dancer.show("霹雳舞");
//	}
//	// 设计艺人来表演节目
//	public void perform(Rapper rapper) {
//		rapper.show("双节棍");
//	}
	
	
	public void perform(Star star,String sm) {
		//这个show方法根据实际参数来执行
		star.show(sm);
	}
}
