package com.singerw.array_03;

public class Array_01 {
    /**
     * @Author Singerw_辛格
     * @Description //TODO
     * @Date 13:55 2021-05-13
     */
    public static void main(String[] args) {
        // 定义数组，三行四列
        int[][] array = new int[3][4];

        System.out.println(array[1][0]);
        System.out.println(array[0].length);
        System.out.println(array[1].length);
        // 3行，每行有几个元素没有声明
        int[][] array1 = new int[3][];
        // 不能指定列，而不指定行 ==》编译出错
        System.out.println(array1[1][0]);
        System.out.println(array1[0].length);
        System.out.println(array1[1].length);
    }
}
