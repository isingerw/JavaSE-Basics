package com.singerw.case10;

/**
 * ����
 *  2-3. ��������,����̳�Star,��дshow����
 * @author Administrator
 *
 */
public class Rapper extends Star {

	@Override
	public void show(String sm) {
		System.out.println("����������Ǯ�������ϳ�����");
		System.out.println(super.getName()+ "��" + sm);
	}
}
