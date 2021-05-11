package com.singerw.day02;

//?
public class A {
	public static void main(String[] args) {

		// ����������﷨
		// �������� ������ = ֵ;
		int n = 1; // ��1��ֵ���ڴ��б��� n

		// Duplicate local variable n
		// ͬһ������������ͬһ�������У�ֻ��Ҫ"����"һ��
		// int n = 2;
		n = 2;

		// final ����
		final int b = 2;

		// ����һ����������ֵ�����ݲ����ٸı���
		//The final local variable b cannot be assigned. 
		//It must be blank and not using a compound 
		//b = 3;

		//System.out.println(������);
		
		System.out.println(n+b);

		
	}

}
