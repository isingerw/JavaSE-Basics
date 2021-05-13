package com.singerw.bubble_sort;

public class Array_Loop_Insertion_Sort_02 {
    /**
     * @Author Singerw_辛格
     * @Description //TODO
     * @Date 10:41 2021-05-13
     */
    public static void main(String[] args) {
        // 定义一个数组并赋值
        int[] array = {122, 34, 56, 2, 34, 67, 243, 64};

        // 存储右侧临时数据（当前要插入进来的数据）
        int current;
        // 从1开始，因为122不用了
        for (int i = 1; i < array.length; i++) {
            // 将122右侧的数据临时存储起来，放入一个自定义变量中
            current = array[i];
            // 循环比较
            // 从i-1的位置开始比较，一直到索引位置为0停止
            for (int j = i - 1; j >= 0; j--) {

                //比较
                if (current < array[j]){
                    // 位置的移动
                    array[j+1] = array[i];
                }else {
                    array[j+1] = current;
                    break;
                }
                // 特殊情况，如果发现j == 0
                if (j == 0){
                    array[j] = current;
                }
            }
        }
    }
}
