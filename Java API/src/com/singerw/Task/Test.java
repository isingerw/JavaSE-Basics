package com.singerw.Task;


public class Test {

    public static void main(String[] args) {
        String str = "string@sima.com";
        String[] arr = str.split("@");
        System.out.println(arr.length);
        // �滻�������µ��ڴ�����洢
        str.replace("@", "#");

        int index = str.indexOf("@");
        String username = str.substring(0, index);
        System.out.println(username);

    }
}