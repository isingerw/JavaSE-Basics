package com.singerw.set.treeset;

/**
 * 创建一个方法，参数为字符串，返回为字符串
 * 传递的阐述格式为 "Hello,WoRd!"
 * 在方法中对字符串进行处理，要求返回值为helloWord
 *
 * @Author 张欣
 * @Date 2021-05-28 16:44
 */
public class HelloWordTask {
    public static void main(String[] args) {
        HelloWordTask hello = new HelloWordTask();
        hello.helloWord("Hello,WoRd");
    }

    public String helloWord(String string) {
        // 1.将字符串，分割为字符串数组
        String[] array = string.split(",");
        for (int i = 0; i < array.length; i++) {
            // hello ==> H
            array[i] = array[i].substring(0, 1).toLowerCase() + array[i].substring(1).toLowerCase();
            String result = array[i];
            System.out.print(result);
        }
        return string;
    }
}
