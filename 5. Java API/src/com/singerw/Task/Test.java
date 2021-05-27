package com.singerw.Task;


public class Test {

    public static void main(String[] args) {
        String str = "string@sima.com";
        String[] arr = str.split("@");
        System.out.println(arr.length);
        // 替换，会在新的内存区域存储
        str.replace("@", "#");

        int index = str.indexOf("@");
        String username = str.substring(0, index);
        System.out.println(username);

    }
}