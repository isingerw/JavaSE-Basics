package com.singerw.case10;

/**
 * ���
 * 2-1. ��������,����̳�Star,��дshow����
 * 
 * @author Administrator
 *
 */
public class Singer extends Star {

	@Override
	public void show(String sm) {
		System.out.println("�����������������������ϳ�����");
		// super.getName() ���ø����getName������ȡname
		System.out.println(super.getName() + " �ڳ� :" + sm);
	}

}
