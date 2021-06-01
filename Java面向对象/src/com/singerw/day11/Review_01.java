package com.singerw.day11;

/**
 * 继承: 子承父业 ;实现了代码复用;同样的属性和方法抽象到父类中来
 * <p>
 * A is B ? A extends B ;B父类(基类)，A子类(派生类); 单继承; 父类更通用，子类会更具体.
 * <p>
 * 1. super关键字使用: 子类中,子类构造方法; 子类，调用父类的实例方法;调用父类非私有的属性
 * 2. 重写:覆写
 * 3. 根据不同引用 和 实例之间进行匹配: 父类引用 = 子类对象 多态问题
 * 4. 多态: 概念 不同类型的对象，对同一消息，作出不同响应.
 * 具体实现方式: 1）创建父类。 2 创建子类，重写父类方法 3.父类引用作为参数 4.传递参数根据子类对象来传递,
 * 实际执行的时候，由于参数不同，过程和结果也不同.
 *
 * @author Administrator
 */
public class Review_01 {
    public static void main(String[] args) {

//		SubClass sc = new SubClass();
//		sc.setN("Subclass");
////		System.out.println(sc); // sc 自动调用sc的toString方法
////		System.out.println(sc.toString()); // sc 自动调用sc的toString方法
////		sc.subt();
//		sc.t();

        // 父类引用 = 子类对象

        SuperClass sc = new SubClass();
        //调用方法  =>(new对象有关)
        //sc.t();
        //调用属性 属性不会被重写 >父类str  子类str
        //调用属性，如果引用是父类的，属性就是父类的. 所以属性的调用只和左侧有关，左侧是谁，就调用谁
        System.out.println(sc.str);
        //new SubClass() 一定是一个subclass类型对象
        System.out.println(new SubClass().str);
        // 父类引用 = 父类对象

        // 子类引用 = 子类对象
    }
}

class SuperClass {
    private String n = "superclass";

    String str = "hello";

    public String getN() {
        return n;
    }

    public void setN(String n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "SuperClass [n=" + n + "]";
    }

    /**
     * 父类t
     */
    public void t() {
        System.out.println("SuperClass t");
    }

}

class SubClass extends SuperClass {
    String str = "kitty";

    public SubClass() {
        super();// 调用父类的构造方法
    }

    public void subt() {
        // 调用父类的t方法
        super.t();
        System.out.println(str);
        //调用父类的非私有的属性
        System.out.println(super.str);
    }

    /**
     * 子类t ，覆盖了父类的方法(覆写 重写)
     */
    @Override
    public void t() {
        System.out.println("SubClass t");
    }

}
