package com.singerw.usbdemo;
/**
* @ClassName: Mouse 接口的实现类
* @Description: 2.2 创建接口实现类，IUSB，重写Installdriver start stop方法
* @Author 张欣
* @Date 2021-05-20 14:17
*/
public class Mouse implements IUSB {
    @Override
    public void installDriver() {
        System.out.println("安装USB鼠标驱动");
    }

    @Override
    public void start() {
        System.out.println("USB鼠标开始工作");
    }

    @Override
    public void stop() {
        System.out.println("USB鼠标停止工作");
    }
}
