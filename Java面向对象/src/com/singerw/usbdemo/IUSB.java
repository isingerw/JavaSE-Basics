package com.singerw.usbdemo;
/**
* @ClassName: IUSB
* @Description: 1 创建接口，父类定义统一的方法
* @Author 张欣
* @Date 2021-05-20 14:00
*/
public interface IUSB {
    void installDriver();
    void start();
    void stop();
}
