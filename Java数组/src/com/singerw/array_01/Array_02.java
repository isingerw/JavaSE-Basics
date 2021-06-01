package com.singerw.array_01;

public class Array_02 {
    /**
     * @Author Singerw_辛格
     * @Description //创建一个数组，存放1-10
     * @Date 15:13 2021-05-12
     */
    public static void main(String[] args) {
        //方案1
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //方案2
        int[] array1 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            //给数组元素赋值
            array1[i] = i + 1;
        }
        // 使用循环通过索引来访问数组元素并输出
        System.out.println("*************普通for循环**************");
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }

        System.out.println("*************增强for循环**************");
        //使用增强的for循环，jdk1.5后增加的
        for (int i:array1){
            System.out.println(i);
        }
    }
}
