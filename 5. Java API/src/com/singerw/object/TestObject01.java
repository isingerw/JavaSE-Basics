package com.singerw.object;

public class TestObject01 {

	public static void main(String[] args) {

		Obj obj1 = new Obj();

		Obj obj2 = new Obj();

		// == ����������˵�Ƚϵ��ǵ�ַ,�ڴ��д洢�����Ƿ���ͬ
		System.out.println(obj1 == obj2);// ? false

		// ���ҽ���x��y������ͬ�Ķ��� x == y����ֵtrue ��ʱ���÷�������true ��
		System.out.println(obj1.equals(obj2));// ? false

		Obj obj3 = obj2;// ��obj2��ֵ��Obj3 �ȼ���obj3��obj2ָ��ĵ�ַһһ����

		System.out.println(obj2 == obj3);
		System.out.println(obj2.equals(obj3));

		System.out.println(obj1.hashCode());
		//obj2 obj3ָ��ͬһ������
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
	}
}

class Obj extends Object {

}
