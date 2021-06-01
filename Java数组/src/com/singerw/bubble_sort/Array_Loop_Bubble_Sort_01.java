package com.singerw.bubble_sort;

public class Array_Loop_Bubble_Sort_01 {
    /**
     * @Author Singerw_辛格
     * @Description //TODO
     * @Date 9:30 2021-05-13
     */
    public static void main(String[] args) {
        int[] array = {100, 23, 4, 57, 344, 65, 34};
        // 比较的轮数为数组长度-1
        for (int i = 0; i < array.length - 1; i++) {
            // 1 -> 6次  7-0-1
            // 2 -> 6次  7-1-1
            // 3 -> 6次  7-2-1
            // 4 -> 6次
            // 5 -> 6次
            for (int j = 0; j < array.length-i-1; j++) {
                if (array[j]>array[j+1]){
                    int t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                }
            }
        }
        // 输出结果
        for(int n:array){
            System.out.println(n);
        }
    }
}
