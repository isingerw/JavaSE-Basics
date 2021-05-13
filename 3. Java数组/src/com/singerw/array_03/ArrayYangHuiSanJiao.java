package com.singerw.array_03;

public class ArrayYangHuiSanJiao {
    /**
     * @Author Singerw_辛格
     * @Description //杨辉三角
     * @Date 14:24 2021-05-13
     */

    public static void main(String[] args) {
        int[][] array = new int[20][20];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <= i; j++) {

                // 两个条件
                if (j == 0 || i == j){
                    array[i][j] = 1;
                }else {
                    array[i][j] = array[i -1][j] +array[i-1][j-1];
                }
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
