package com.singerw.day08;

/**
 * �����࣬���巽������ж�ĳ�����Ƿ�������
 * �в������޷���ֵ
 * �в������з���ֵ
 * ʹ��`Debug`��ɳ���ĵ���
 *
 * @Author ����
 * @Date 2021-05-20 0:34
 */
public class ZhiShu {
    /**
     * @param n
     */
    public void judge1(int n) {
        // �ж�n�Ƿ���������������
        boolean flag = true;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(n + "������");
        } else {
            System.out.println(n + "��������");
        }
    }

    /**
     * @param n
     * @return
     */
    public boolean judge2(int n) {
        // �ж�n�Ƿ���������������
        boolean flag = true;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
