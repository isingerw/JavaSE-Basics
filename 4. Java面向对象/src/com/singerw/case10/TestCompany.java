package com.singerw.case10;

/**
 * 4 �����࣬���Ǹ����������������Ķ�������
 * ִ�н���������������Ĳ�ͬ��ִ�н��Ҳ��ͬ.
 * @author Administrator
 *
 */
public class TestCompany {

	public static void main(String[] args) {

		// ������������
		// 1.���
		Singer singer = new Singer();
		singer.setName("���");

		// 2.������
		Dancer dancer = new Dancer();
		dancer.setName("������");

		// 3.����
		Rapper rapper = new Rapper();
		rapper.setName("����");

		// company
		Company com = new Company();
		// ���ݣ����ݲ���
		com.perform(singer,"ͻȻ������");
		com.perform(dancer,"������");
		com.perform(rapper,"˫�ع�");
	}

}
