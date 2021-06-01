package com.singerw.arrays.demo;

import java.util.Comparator;
/**
 * @ClassName: MyComparator01
 * @Description: //TODO 外部比较器
 * @Author: CodeSleep
 * @Date: 2021-05-31 15:03
 * @Version: 1.0
 */
public class MyComparator01 implements Comparator<String> {
    public int compare(String o1, String o2) {
        return Integer.valueOf(o1) - Integer.valueOf(o2);
    }
}


