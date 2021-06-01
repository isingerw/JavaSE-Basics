package com.singerw.object;

public class TestStudent {

	public static void main(String[] args) {

		Student s1 = new Student(1, "水文");
		Student s2 = new Student(1, "水文");

		System.out.println(s1 == s2);// 地址 false
		System.out.println(s1.equals(s2)); // 调用Object方法 结果依然是false

		// 程序业务有个需求，如果学号和姓名是相同的.我们就认为这两个学生是同一个学生.
		System.out.println(s1.equals(s2)); // true

	

	}
}
