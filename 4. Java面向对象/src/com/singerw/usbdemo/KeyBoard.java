package com.singerw.usbdemo;
/**
* @ClassName: KeyBoard �ӿڵ�ʵ����
* @Description: 2.1 �����ӿ�ʵ���࣬IUSB����дInstalldriver start stop����
* @Author ����
* @Date 2021-05-20 14:02
*/
public class KeyBoard implements IUSB{
    @Override
    public void installDriver() {
        System.out.println("��װUSB��������");
    }

    @Override
    public void start() {
        System.out.println("USB���̿�ʼ����");
    }

    @Override
    public void stop() {
        System.out.println("USB����ֹͣ����");
    }
}
