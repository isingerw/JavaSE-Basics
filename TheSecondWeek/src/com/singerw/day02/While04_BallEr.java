package com.singerw.day02;

/**
* @Author Singerw_辛格
* @Description //TODO
* @Date 16:47 2021-05-11
*/
public class While04_BallEr {
    /**
    * @Author Singerw_辛格
    * @Description //TODO
    * @Date 16:47 2021-05-11
    */
    public static void main(String[] args) {
        double height = 100;
        int i = 0;
        while (height >= 0.1) {
            height = height / 2;
            i++;
        }
        System.out.println(height);
    }
}
