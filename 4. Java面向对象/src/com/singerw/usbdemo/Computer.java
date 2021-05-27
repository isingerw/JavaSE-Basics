package com.singerw.usbdemo;

/**
* @ClassName: Computer
* @Description: 3 类中有一个方法，方法的参数是接口引用
* @Author 张欣
* @Date 2021-05-20 14:15
*/
public class Computer {
    public void install(IUSB usb){
        usb.installDriver(); // 安装设备驱动
        usb.start();  // 设备开始工作
        usb.stop();  // 设备停止工作
    }
}
