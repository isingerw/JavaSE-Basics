package com.singerw.day08;

import com.sun.deploy.pings.Pings;

/**
* @ClassName: OOP_Class_03
* @Description: TODO(������һ�仰��������������)
* @Author ����
* @Date 2021-05-18 23:28
*/
public class OOP_Class_03 {
    public static void main(String[] args) {
        Pig pig = new Pig();
        pig.show();
        pig.show1();
        pig.show2();
    }
}

class Pig{
    String name = "����";

    public void show(){
        // nameֻ�������������ʹ�ã�����ⲿ��������
        String name = "�˽�";
        // name�ǰ˽��ػ��ǰ˽���
        System.out.println(name);
    }

    public void show1(){
        // name�����滹�������ţ�
        System.out.println(name);
    }
    public void show2(){
        String name = "������";
        System.out.println(name);
        // this Ϊ���� ��ָ��ǰ�����Ķ���
        System.out.println(this.name);
    }
}
