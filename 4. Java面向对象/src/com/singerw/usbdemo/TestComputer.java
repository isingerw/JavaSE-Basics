package com.singerw.usbdemo;

/**
* @ClassName: TestComputer
* @Description: 4 �����࣬���Ǹ���������������ࣨ�ӿ�ʵ���ࣩ�Ķ���
 *                  ����ִ�н���������������Ĳ�ͬ��ִ�н��Ҳ��ͬ
* @Author ����
* @Date 2021-05-20 14:20
*/
public class TestComputer {
    public static void main(String[] args) {
        Computer computer = new Computer();
        // �����豸
        KeyBoard keyBoard = new KeyBoard();
        // ���ð�װ�ķ���
        computer.install(keyBoard);

        // ����豸
        Mouse mouse = new Mouse();
        computer.install(mouse);
    }
}
