package com.singerw.day08;

public class OOP_Class_01 {
    public static void main(String[] args) {
        // ��������
        // ��� person ��Ϊ�������������Ҳ� new Person()����������
        Person person = new Person();
        // ��ôʹ�����Ժͷ�����
        person.sfz = "632123199712237532";
        person.height = 178;
        person.sex = '��';
        person.weight = 130;
        String address;

        System.out.println(person.height);
        System.out.println(person.address);

        //���ʹ�÷�����
        person.eat();
        person.drink();
        person.coding();
    }
}

// ����һ������
// Java ��> ����Ҫ�����������
// ������������Զ���
class Person{
    // ��̬�����ԣ�����������ֱ�ӷ������У���Ϊ��Ա����
    String sfz;
    int height;
    double weight;
    char sex;
    String address;

    // ��̬�� ���־��Ƿ�������Ա����
    // ���η� �����ķ���ֵ���� ��������������{ }
    public void eat(){
        System.out.println("�Ե�����");
    }

    public void drink(){
        System.out.println("�Ϳ���ˮ");
    }

    public void coding(){
        System.out.println("��Java���룬Java��ȫ������õ�����");
    }
}
