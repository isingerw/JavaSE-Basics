package com.singerw.set.students;


import java.util.HashSet;

public class StudentsTest {
    public static void main(String[] args) {
        HashSet<Object> set = new HashSet<>();

        Students s1 = new Students(1,"singerw");
        Students s2 = new Students(1,"singerw");
        set.add(s1);
        set.add(s2);



        System.out.println(s1.hashCode() == s2.hashCode());
        System.out.println(s1.equals(s2));




    }

}