package com.singerw.day10;

/**
* @ClassName: Son
* @Description: TODO(这里用一句话描述这个类的作用)
* @Author 张欣
* @Date 2021-05-25 22:54
*/
public class Son extends Father {
    public void test1(){
        // 在子类实例方法调用父类中的实例方法t()；
        // sqper关键字，一定出现在子类中，调用父类的属性或者方法
        super.t();
        t(); // 如果不加super，默认找当前类的方法t()，如果当前类中不存在，再去调用父类中的方法t()

    }

}
