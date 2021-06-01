package com.singerw.object;

public class TestObject02 {

	public static void main(String[] args) {

		Object obj = new Object();
		//某个对象的身份证:唯一标志
		int hashcode = obj.hashCode();
		System.out.println(hashcode);
		
	}

}
