package com.singerw.case10;

/**
 *    ������
 *     2-2. ��������,����̳�Star,��дshow����
 * @author Administrator
 *
 */
public class Dancer extends Star {
	

	@Override
	public void show(String sm) {
		System.out.println("�������������������赸���ϳ�����");
		System.out.println(super.getName() + "���� " + sm);
	}

}
