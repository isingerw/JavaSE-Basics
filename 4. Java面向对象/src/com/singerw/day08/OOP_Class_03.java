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
        pig.show1();
        pig.show2();
        pig.show3();
    }
}

class Pig{
    // �������κ�ʵ��������ʹ��
    String name = "����";

    public void show1(){
        // nameֻ�������������ʹ�ã�����ⲿ��ͬ������ʱ����Ϊ�ͽ�ԭ��
        String name = "�˽�";
        // ����˽�
        System.out.println("show1:"+name);
    }

    public void show2(){
        // name �������
        System.out.println("show2:"+name);
    }

    public void show3(){
        String name = "������";
        // this Ϊ���� ��ָ��ǰ�����Ķ���
        System.out.println("show3:"+this.name);
    }
}
