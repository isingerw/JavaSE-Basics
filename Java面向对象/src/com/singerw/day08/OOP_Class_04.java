package com.singerw.day08;

/**
 * @ClassName: OOP_Class_04
 * �����࣬���巽������ж�ĳ�����Ƿ�������
 * �в������޷���ֵ
 * �в������з���ֵ
 * ʹ��Debug��ɳ���ĵ���
 * @Author ����
 * @Date 2021-05-20 0:26
 */
public class OOP_Class_04 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        ZhiShu zhiShu = new ZhiShu();
        int n = 123;
        zhiShu.judge1(n);
        boolean flag = zhiShu.judge2(n);
        if (flag) {
            System.out.println(n + "������");
        } else {
            System.out.println(n + "��������");
        }
    }

}
