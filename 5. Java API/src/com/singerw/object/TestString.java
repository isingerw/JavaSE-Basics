package com.singerw.object;

public class TestString {
	public static void main(String[] args) {

		// �ַ������󴴽�
		String str1 = new String("abc");
		String str2 = new String("abc");
		// ����,��Object�̳ж�����������д��.���αȽ������ַ������ַ�������
		boolean flag = str1.equals(str2);

		System.out.println(flag);
		
		System.out.println(str1.hashCode());

	}

}
