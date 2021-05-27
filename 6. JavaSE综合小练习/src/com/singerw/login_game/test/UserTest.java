package com.singerw.login_game.test;

import com.singerw.login_game.impl.UserDaoImpl;
import com.singerw.login_game.pojo.User;

import java.util.Scanner;

/**
 * @ClassName: UserTest
 * 测试登录注册功能
 * @Author 张欣
 * @Date 2021-05-26 18:54
 */
class UserTest {

    public static boolean flag = false;

    public static void main(String[] args) {
        UserDaoImpl userDao = new UserDaoImpl();
        User user = userDao.getUser();

        while (true) {
            System.out.println("**************************************");
            System.out.println("欢迎界面");
            System.out.println("1 登录");
            System.out.println("2 注册");
            System.out.println("3 退出");
            System.out.print("请选择你要执行的操作：");
            Scanner input = new Scanner(System.in);
            int sc = input.nextInt();

            switch (sc) {
                case 1:
                    for (int i = 2; i >= 0; i++) {
                        flag = true;
                        System.out.print("请输入用户名：");
                        String username = input.next();
                        System.out.print("请输入密码：");
                        String password = input.next();
                        if (userDao.isLogin(username, password)) {
                            System.out.println("恭喜你，登录成功！");
                            while (flag) {
                                System.out.println("-----------Welcome-----------");
                                System.out.println("请选择要玩的游戏：");
                                System.out.println("1 抽奖");
                                System.out.println("2 排序");
                                System.out.println("3 查找");
                                System.out.println("4 猜数");
                                System.out.println("5 退出");
                                break;
                            }
                        } else {
                            System.out.println("用户名或密码错误！请重新登录！");
                        }
                        if (i == 3) {
                            System.out.println("锁定登录");
                            System.exit(0);
                        }
                    }
                    break;

                case 2:
                    System.out.println("请输入注册的用户名");
                    System.out.print("注册用户名：");
                    String newusername = input.next();
                    System.out.print("密码：");
                    String newpassword = input.next();
                    user = userDao.regist(newusername, newpassword);
                    if (!"".equals(user.getUsername())) {
                        System.out.println("注册成功");
                    } else {
                        System.out.println("注册失败");
                    }
                    break;

                case 3:
                    System.exit(0);
                    break;

                default:
                    break;
            }
            if (flag) {
                break;
            }
        }
    }
}
