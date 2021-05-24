package com.singerw.object;

public class TestObject01 {

	public static void main(String[] args) {

		Obj obj1 = new Obj();

		Obj obj2 = new Obj();

		// == 引用类型来说比较的是地址,内存中存储区域是否相同
		System.out.println(obj1 == obj2);// ? false

		// 当且仅当x和y引用相同的对象（ x == y具有值true ）时，该方法返回true 。
		System.out.println(obj1.equals(obj2));// ? false

		Obj obj3 = obj2;// 将obj2赋值给Obj3 等价于obj3和obj2指向的地址一一样的

		System.out.println(obj2 == obj3);
		System.out.println(obj2.equals(obj3));

		System.out.println(obj1.hashCode());
		//obj2 obj3指向同一个对象
		System.out.println(obj2.hashCode());
		System.out.println(obj3.hashCode());
	}
}

class Obj extends Object {

}
