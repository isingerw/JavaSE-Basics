package com.singerw.day02;

/**
* @Author Singerw_辛格
* @Description //TODO
* @Date 15:25 2021-05-11
* @Param
* @return
*/
public class Debug {
    /**
    * @Author Singerw_辛格 
    * @Description //TODO 
    * @Date 15:31 2021-05-11
    * @Param 
    * @return  
    */
    public static void main(String[] args) {
        double height = 100;
        for (int i = 1; height >= 0.1 ; i++) {
            height = height / 2;
        }
        System.out.println(height);
    }
}
