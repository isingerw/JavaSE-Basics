package com.singerw.day02;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1);// 1 => int

		byte b = 1; //�ж�1�Ƿ���byte��Χ�ڣ�ֱ��ת��
		short s = 2;
		int i = 3;
		long l = 4;
		System.out.println(b + s + i + l); //?�������� long
		
		byte b1 = 128;
		
		//Type mismatch: cannot convert from double to float
		// 3.14 =>��С�����Ĭ�϶���double����, �����ֺ����f
		float f = 3.14f;
		double d = 3.141592653589793;
		
		boolean bl = false; //�� ��
		
		System.out.println(f+d);
		

		//+�ӷ������ʱ�����ǵı���һ��Ҫ����.
		System.out.println(f+d+bl);

	}

}
