package com.singerw.set.treeset;

import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet<Object> set = new TreeSet<>();
        // ��ӵ�ʱ�򣬰�����Ȼ˳������a.b.c.d.e.f.g.h....��
        set.add("abc");
        set.add("abcd");
        set.add("cba");
        set.add("zabc");
        set.add("cba");
        System.out.println(set);
    }
}
