package com.singerw.day09;

public class Method_01 {
    public static void main(String[] args) {
        Test01 test01 = new Test01();
        test01.method01();
        main(null);
    }
}

class Test01{
    /**
     * 实例方法1
     */
    public void method01(){
        // 两个实例方法之间相互调用，不用加引用名
        method02();
        System.out.println("method01");
    }

    /**
     * 实例方法2
     */
    public void method02(){
        System.out.println("method02");
    }

}
