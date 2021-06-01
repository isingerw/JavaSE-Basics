package com.singerw.trycatchfinally;

public class TryCatchFinally {
    public static void main(String[] args) {
        System.out.println(t());
    }

    public static int t() {
        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }

}
