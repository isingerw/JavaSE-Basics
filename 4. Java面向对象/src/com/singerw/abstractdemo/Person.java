package com.singerw.abstractdemo;

/**
 * abstract class 抽象类 抽象类不能直接被实例化
 *
 * @author Administrator
 */
public abstract class Person {
    // 属性
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 方法
    public Person() {
        // TODO Auto-generated constructor stub
    }


    public Person(String name) {
        super();
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + "]";
    }

    //没有方法体的方法称为抽象方法
    public abstract String show();

}
