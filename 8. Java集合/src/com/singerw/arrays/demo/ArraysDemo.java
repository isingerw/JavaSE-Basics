package com.singerw.arrays.demo;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {
    public static void main(String[] args) {
        List objects = Arrays.asList("a", "gs", "sd");

        // 排序 从小到大
        int [] array = {12,34,1,23,54,66,776,23,1,34};
        Arrays.sort(array);
        for (int i : array){
            System.out.println(i);
        }

    }
}
