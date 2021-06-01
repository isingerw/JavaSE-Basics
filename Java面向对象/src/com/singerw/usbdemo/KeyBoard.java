package com.singerw.usbdemo;
/**
* @ClassName: KeyBoard 接口的实现类
* @Description: 2.1 创建接口实现类，IUSB，重写Installdriver start stop方法
* @Author 张欣
* @Date 2021-05-20 14:02
*/
public class KeyBoard implements IUSB{
    @Override
    public void installDriver() {
        System.out.println("安装USB键盘驱动");
    }

    @Override
    public void start() {
        System.out.println("USB键盘开始工作");
    }

    @Override
    public void stop() {
        System.out.println("USB键盘停止工作");
    }
}
