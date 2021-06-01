package com.singerw.condition;

import java.util.Scanner;
/**
* @Author Singerw_辛格 
* @Description //TODO 
* @Date 13:54 2021-05-10
* @Param 
* @return  
*/
public class If_else_01 {
    /**
    * @Author Singerw_辛格
    * @Description //TODO
    * @Date 11:02 2021-05-10
    * @Param
    * @return
    */
    public static void main(String[] args) {
        System.out.println("我们在结婚吧！");
        Scanner input = new Scanner(System.in);
        String ans = input.next();
        if (ans.equals("我愿意")){
            System.out.println("领证结婚，赶紧去泰国蜜月");
        }else {
            System.out.println("你是个好人");
        }
    }
}
