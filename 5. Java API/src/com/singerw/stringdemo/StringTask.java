package com.singerw.stringdemo;

/**
 * @ClassName: StringTask
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author 张欣
 * @Date 2021-05-25 16:03
 */
public class StringTask {
    // hello,java,hello,word
    // HelloJavaHelloWord
    public static void main(String[] args) {
        String str = "hello,java,hello,word";
        // 1.将字符串，分割为字符串数组
        String[] arr = str.split(",");

        // 2.for
        for (int i = 0; i < arr.length; i++) {
            // hello ==> H
            arr[i] = arr[i].substring(0, 1).toUpperCase()+arr[i].substring(1).toLowerCase();
            String result = arr[i];
            System.out.println(result);
        }
    }
}
