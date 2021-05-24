package com.singerw.day09;

/**
 * @ClassName: Method_03
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author 张欣
 * @Date 2021-05-17 13:47
 */
public class Method_03 {
    public static void main(String[] args) {

        Test03 t = new Test03();
        int[] n = {1, 2, 3, 5, 7};
        t.method01(n);
        // 调用方法结束之后，我们也可以数组n
        // 输出数组元素，a是数组中每个元素
        // 当我们参数为引用类型数组名，传递的参数是数组名，由于数组是引用类型，
        // 所以我们传递参数相当于参数n和自定义方法的参数n，指向的是内存中的同一个地址。
        System.out.println("main===> 数组n中的元素");
        for (int a : n) {
            System.out.println(a);
        }
    }
}

class Test03 {
    /**
     * 实例方法，方法的参数是一个整型的数组
     *
     * @param n
     */
    public void method01(int[] n) {
        for (int i = 0; i < n.length; i++) {
            // 数组每个元素在原来的基础上乘以2
            n[i] = n[i] * 2;
        }
        System.out.println("Test03===> 数组n中的元素");
        for (int a : n) {
            System.out.println(a);
        }
    }
}


