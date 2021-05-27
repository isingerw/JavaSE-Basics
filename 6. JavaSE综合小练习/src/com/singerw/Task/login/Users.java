package com.singerw.Task.login;

import java.util.Scanner;

public class Users {
    private String userNema = "singerw";
    private String passWord = "123456";

    /**
     * 接收输入的用户名和密码
     */
    public void userName(){
        Scanner inputuser = new Scanner(System.in);
        Scanner inputpass = new Scanner(System.in);
        for (int i = 2; i >=0 ; i--) {
            System.out.print("请输入用户名：");
            String username = inputuser.nextLine();
            System.out.print("请输入密码：");
            String password = inputpass.nextLine();
            if (username.equals(userNema) && password.equals(passWord)){
                System.out.println("用户登陆成功！");
                break;
            }else if (i == 0) {
                System.out.println("登录失败！您已经没机会重新登录！");
            } else {
                System.out.println("登录失败！您还有" + i + "次机会，请重新登陆！");
            }
        }
    }

    // 验证并实现登录
    public void login(){
        userName();
    }

}

