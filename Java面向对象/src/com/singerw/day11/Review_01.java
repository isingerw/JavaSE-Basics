package com.singerw.day11;

/**
 * �̳�: �ӳи�ҵ ;ʵ���˴��븴��;ͬ�������Ժͷ������󵽸�������
 * <p>
 * A is B ? A extends B ;B����(����)��A����(������); ���̳�; �����ͨ�ã�����������.
 * <p>
 * 1. super�ؼ���ʹ��: ������,���๹�췽��; ���࣬���ø����ʵ������;���ø����˽�е�����
 * 2. ��д:��д
 * 3. ���ݲ�ͬ���� �� ʵ��֮�����ƥ��: �������� = ������� ��̬����
 * 4. ��̬: ���� ��ͬ���͵Ķ��󣬶�ͬһ��Ϣ��������ͬ��Ӧ.
 * ����ʵ�ַ�ʽ: 1���������ࡣ 2 �������࣬��д���෽�� 3.����������Ϊ���� 4.���ݲ��������������������,
 * ʵ��ִ�е�ʱ�����ڲ�����ͬ�����̺ͽ��Ҳ��ͬ.
 *
 * @author Administrator
 */
public class Review_01 {
    public static void main(String[] args) {

//		SubClass sc = new SubClass();
//		sc.setN("Subclass");
////		System.out.println(sc); // sc �Զ�����sc��toString����
////		System.out.println(sc.toString()); // sc �Զ�����sc��toString����
////		sc.subt();
//		sc.t();

        // �������� = �������

        SuperClass sc = new SubClass();
        //���÷���  =>(new�����й�)
        //sc.t();
        //�������� ���Բ��ᱻ��д >����str  ����str
        //�������ԣ���������Ǹ���ģ����Ծ��Ǹ����. �������Եĵ���ֻ������йأ������˭���͵���˭
        System.out.println(sc.str);
        //new SubClass() һ����һ��subclass���Ͷ���
        System.out.println(new SubClass().str);
        // �������� = �������

        // �������� = �������
    }
}

class SuperClass {
    private String n = "superclass";

    String str = "hello";

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "SuperClass [n=" + n + "]";
    }

    /**
     * ����t
     */
    public void t() {
        System.out.println("SuperClass t");
    }

}

class SubClass extends SuperClass {
    String str = "kitty";

    public SubClass() {
        super();// ���ø���Ĺ��췽��
    }

    public void subt() {
        // ���ø����t����
        super.t();
        System.out.println(str);
        //���ø���ķ�˽�е�����
        System.out.println(super.str);
    }

    /**
     * ����t �������˸���ķ���(��д ��д)
     */
    @Override
    public void t() {
        System.out.println("SubClass t");
    }

}
