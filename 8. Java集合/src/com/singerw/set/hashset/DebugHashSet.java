package com.singerw.set.hashset;

import java.util.HashSet;

public class DebugHashSet {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("abc");
        for (int i = 1; i <= 13; i++) {
            set.add(i);
        }
    }
}
