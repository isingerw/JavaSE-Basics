package com.singerw.usbdemo;
/**
* @ClassName: Mouse �ӿڵ�ʵ����
* @Description: 2.2 �����ӿ�ʵ���࣬IUSB����дInstalldriver start stop����
* @Author ����
* @Date 2021-05-20 14:17
*/
public class Mouse implements IUSB {
    @Override
    public void installDriver() {
        System.out.println("��װUSB�������");
    }

    @Override
    public void start() {
        System.out.println("USB��꿪ʼ����");
    }

    @Override
    public void stop() {
        System.out.println("USB���ֹͣ����");
    }
}
