package com.singerw.abstractdemo;

public class TestPerson {

	public static void main(String[] args) {
		Person p = new Person() {
			@Override
			public String show() {
				return null;
			}
		};
	}
}
