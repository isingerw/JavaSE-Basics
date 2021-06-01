package com.singerw.usbdemo;

/**
* @ClassName: TestComputer
* @Description: 4 测试类，我们根据情况，传递子类（接口实现类）的对象；
 *                  最终执行结果，根据子类对象的不同，执行结果也不同
* @Author 张欣
* @Date 2021-05-20 14:20
*/
public class TestComputer {
    public static void main(String[] args) {
        Computer computer = new Computer();
        // 键盘设备
        KeyBoard keyBoard = new KeyBoard();
        // 调用安装的方法
        computer.install(keyBoard);

        // 鼠标设备
        Mouse mouse = new Mouse();
        computer.install(mouse);
    }
}
