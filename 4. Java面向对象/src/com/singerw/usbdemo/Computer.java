package com.singerw.usbdemo;

import org.jetbrains.annotations.NotNull;

/**
* @ClassName: Computer
* @Description: 3 ������һ�������������Ĳ����ǽӿ�����
* @Author ����
* @Date 2021-05-20 14:15
*/
public class Computer {
    public void install(IUSB usb){
        usb.installDriver(); // ��װ�豸����
        usb.start();  // �豸��ʼ����
        usb.stop();  // �豸ֹͣ����
    }
}
