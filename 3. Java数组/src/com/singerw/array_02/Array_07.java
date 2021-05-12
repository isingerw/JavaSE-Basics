package com.singerw.array_02;

public class Array_07 {
    /**
     * @Author Singerw_辛格
     * @Description //选择排序的算法
     * @Date 16:58 2021-05-12
     */
    public static void main(String[] args) {
        // 最小值下标
        int smaller = 0;
        // 可以和for循环结合在一起
        int[] array = {1, 2, 23, 51, 18, 502, 41};
        for (int i = 0; i < array.length - 1; i++) {
            // 自定义一个smaLler samller为最小值
            smaller = i;
            // 比较，用当前的索引值和剩余的每一个元素都比较一次
            for (int j = i + 1; j < array.length; j++) {
                // 比较
                if (array[smaller] > array[j]) {
                    // j的位置更新，重新定义smaller
                    smaller = j;
                }
            }
            // 得到最小值的所在位置，索引位置smaller
            if (smaller != i) {
                // 交换
                int temp = array[smaller];
                array[smaller] = array[i];
                array[i] = temp;
            }
        }
        // 输出结果
        for (int a:array){
            System.out.println(a);
        }

    }
}
