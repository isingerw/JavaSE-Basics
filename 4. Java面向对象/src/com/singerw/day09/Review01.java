package com.singerw.day09;
/**
* @ClassName: Review01
* @Description: TODO(������һ�仰��������������)
* @Author ����
* @Date 2021-05-20 1:28
*/
public class Review01 {
    public static void main(String[] args) {
        // ��������
        Person person = new Person();
        person.name = "�Ÿ��";
        person.eat1();
        person.eat2("ɳ����");
        person.eat3("ɳ����", "������");
    }
}

class Person {
    // �������ԡ�����������Ա������
    // �﷨������Ȩ�� ���η� �������� ������ = ֵ���������ֵ��Ĭ��ֵ
    String name;
    int age;
    char sex;

    //������������������Ա����
    // �﷨������Ȩ�� ���η� ����ֵ���� ������(����1 ����2){ }

    /**
     * �޲������޷���ֵ
     */
    public void eat1() {
        System.out.println(name + "�ڳ�");
    }

    /**
     * ���������޷���ֵ
     * @param food
     */
    public void eat2(String food) {
        System.out.println(name + "�ڳ�" + food);
    }

    /**
     * ���������޷���ֵ
     * @param food
     * @param drink
     */
    public void eat3(String food, String drink) {
        System.out.println(name + "�ڳ�" + food + ",��" + drink);
    }
}
