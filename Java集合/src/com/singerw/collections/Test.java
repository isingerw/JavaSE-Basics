package com.singerw.collections;


import java.util.HashMap;

public class Test {
    public static void main(String[] args) {

        HashMap map = new HashMap();
        map.put(1, "abc");
        map.put(2, "abc");
        System.out.println(map.get(1).equals(map.get(2)));
    }
}
