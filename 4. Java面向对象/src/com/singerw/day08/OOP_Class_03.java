package com.singerw.day08;

import com.sun.deploy.pings.Pings;

/**
* @ClassName: OOP_Class_03
* @Description: TODO(这里用一句话描述这个类的作用)
* @Author 张欣
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
    // 可以在任何实例方法中使用
    String name = "佩琪";

    public void show1(){
        // name只能在这个方法内使用，如果外部有同名，此时引用为就近原则；
        String name = "八戒";
        // 输出八戒
        System.out.println("show1:"+name);
    }

    public void show2(){
        // name 输出佩奇
        System.out.println("show2:"+name);
    }

    public void show3(){
        String name = "猪猪侠";
        // this 为代称 ；指当前这个类的对象。
        System.out.println("show3:"+this.name);
    }
}
