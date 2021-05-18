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
        pig.show();
        pig.show1();
        pig.show2();
    }
}

class Pig{
    String name = "佩琪";

    public void show(){
        // name只能在这个方法内使用，如果外部有命名，
        String name = "八戒";
        // name是八戒呢还是八戒呢
        System.out.println(name);
    }

    public void show1(){
        // name是佩奇还是佩奇呐？
        System.out.println(name);
    }
    public void show2(){
        String name = "猪猪侠";
        System.out.println(name);
        // this 为代称 ；指当前这个类的对象。
        System.out.println(this.name);
    }
}
