package com.singerw.day12;


/**
* @ClassName: IA
* @Description: TODO(������һ�仰��������������)
* @Author ����
* @Date 2021-05-20 9:47
*/
public interface IA {
    // 1��������
    int a = 2; // a Ҫ��ֵ���ܶ���ʹ��
    final int b =2;
    static final int c = 2;
    public static final int d = 2;

    // 2���󷽷�
    public abstract void t1();
    abstract void t2();
    void t3();

    // 3Ĭ�Ϸ���
    default void t4(){
        System.out.println("jdk1.8 default method");
    }
}
