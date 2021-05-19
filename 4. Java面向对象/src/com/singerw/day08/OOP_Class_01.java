package com.singerw.day08;

public class OOP_Class_01 {
    public static void main(String[] args) {
        // 创建对象
        // 左侧 person 称为“引用名”，右侧 new Person()“创建对象”
        Person person = new Person();
        // 怎么使用属性和方法？
        person.sfz = "632123199712237532";
        person.height = 178;
        person.sex = '男';
        person.weight = 130;
        String address;

        System.out.println(person.height);
        System.out.println(person.address);

        //如何使用方法？
        person.eat();
        person.drink();
        person.coding();
    }
}

// 创建一个对象，
// Java —> 对象要依赖于类存在
// 对象，万事万物皆对象
class Person{
    // 静态，属性，变量，变量直接放在类中，成为成员属性
    String sfz;
    int height;
    double weight;
    char sex;
    String address;

    // 动态， 表现就是方法，成员方法
    // 修饰符 方法的返回值类型 方法名（参数）{ }
    public void eat(){
        System.out.println("吃蛋炒饭");
    }

    public void drink(){
        System.out.println("和快乐水");
    }

    public void coding(){
        System.out.println("敲Java代码，Java是全世界最好的语言");
    }
}
