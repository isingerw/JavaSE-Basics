package com.singerw.array_03;

public class Array_03 {
    public static void main(String[] args) {

        // 定义数组，三行四列
        int[][] array = new int[3][4];

        System.out.println(array[1][0]);
        System.out.println(array[0].length);
        System.out.println(array[1].length);

        // 3行，每行有几个元素？没声明
        int[][] array1 = new int[3][];

        //每一行都要独立实例化

        array1[0] = new int[5];
        array1[1] = new int[5];
        array1[2] = new int[]{1, 2, 3, 4, 5};
        System.out.println(array1[1][0]);
        System.out.println(array1[0].length);
        System.out.println(array1[1].length);

        // 不能指定列，而不指定行 =>编译出错.
        // int[][] array2 = new int[][4];
        // 两行

        // 遍历
//		for (int i = 0; i < 2; i++) {
//
//			for (int j = 0; j < 3; j++) {
//				System.out.print(array[i][j] + " ");
//			}
//			System.out.println();
//		}

    }
}
