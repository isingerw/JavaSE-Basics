package com.singerw.case10;

/**
 * 4 测试类，我们根据情况，传递子类的对象；最终
 * 执行结果，根据子类对象的不同，执行结果也不同.
 * @author Administrator
 *
 */
public class TestCompany {

	public static void main(String[] args) {

		// 邀请三个明星
		// 1.伍佰
		Singer singer = new Singer();
		singer.setName("伍佰");

		// 2.蔡徐坤
		Dancer dancer = new Dancer();
		dancer.setName("蔡徐坤");

		// 3.宝国
		Rapper rapper = new Rapper();
		rapper.setName("宝国");

		// company
		Company com = new Company();
		// 表演，传递参数
		com.perform(singer,"突然的自我");
		com.perform(dancer,"霹雳舞");
		com.perform(rapper,"双截棍");
	}

}
