package com.singerw.day09;
/**
* @ClassName: Review01
* @Description: TODO(这里用一句话描述这个类的作用)
* @Author 张欣
* @Date 2021-05-20 1:28
*/
public class Review01 {
    public static void main(String[] args) {
        // 常见对象
        Person person = new Person();
        person.name = "张哥哥";
        person.eat1();
        person.eat2("沙茶面");
        person.eat3("沙茶面", "蛋花汤");
    }
}

class Person {
    // 静：属性、变量、“成员”变量
    // 语法：访问权限 修饰符 变量类型 变量名 = 值；如果不赋值有默认值
    String name;
    int age;
    char sex;

    //动：方法、函数、成员方法
    // 语法：访问权限 修饰符 返回值类型 方法名(参数1 参数2){ }

    /**
     * 无参数，无返回值
     */
    public void eat1() {
        System.out.println(name + "在吃");
    }

    /**
     * 带参数，无返回值
     * @param food
     */
    public void eat2(String food) {
        System.out.println(name + "在吃" + food);
    }

    /**
     * 带参数，无返回值
     * @param food
     * @param drink
     */
    public void eat3(String food, String drink) {
        System.out.println(name + "在吃" + food + ",配" + drink);
    }
}
