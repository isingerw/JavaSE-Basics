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
     * ʵ������1
     */
    public void method01(){
        // ����ʵ������֮���໥���ã����ü�������
        method02();
        System.out.println("method01");
    }

    /**
     * ʵ������2
     */
    public void method02(){
        System.out.println("method02");
    }

}
