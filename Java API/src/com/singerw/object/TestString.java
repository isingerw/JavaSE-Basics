package com.singerw.object;

public class TestString {
	public static void main(String[] args) {

		// 字符串对象创建
		String str1 = new String("abc");
		String str2 = new String("abc");
		// 方法,从Object继承而来，但是重写了.依次比较两个字符串中字符的内容
		boolean flag = str1.equals(str2);

		System.out.println(flag);
		
		System.out.println(str1.hashCode());

	}

}
