package com.singerw.object;

public class TestStudent {

	public static void main(String[] args) {

		Student s1 = new Student(1, "ˮ��");
		Student s2 = new Student(1, "ˮ��");

		System.out.println(s1 == s2);// ��ַ false
		System.out.println(s1.equals(s2)); // ����Object���� �����Ȼ��false

		// ����ҵ���и��������ѧ�ź���������ͬ��.���Ǿ���Ϊ������ѧ����ͬһ��ѧ��.
		System.out.println(s1.equals(s2)); // true

	

	}
}
