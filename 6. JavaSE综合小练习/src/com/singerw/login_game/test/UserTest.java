package com.singerw.login_game.test;

import com.singerw.login_game.impl.UserDaoImpl;
import com.singerw.login_game.pojo.User;

import java.util.Scanner;

/**
 * @ClassName: UserTest
 * ���Ե�¼ע�Ṧ��
 * @Author ����
 * @Date 2021-05-26 18:54
 */
class UserTest {

    public static boolean flag = false;

    public static void main(String[] args) {
        UserDaoImpl userDao = new UserDaoImpl();
        User user = userDao.getUser();

        while (true) {
            System.out.println("**************************************");
            System.out.println("��ӭ����");
            System.out.println("1 ��¼");
            System.out.println("2 ע��");
            System.out.println("3 �˳�");
            System.out.print("��ѡ����Ҫִ�еĲ�����");
            Scanner input = new Scanner(System.in);
            int sc = input.nextInt();

            switch (sc) {
                case 1:
                    for (int i = 2; i >= 0; i++) {
                        flag = true;
                        System.out.print("�������û�����");
                        String username = input.next();
                        System.out.print("���������룺");
                        String password = input.next();
                        if (userDao.isLogin(username, password)) {
                            System.out.println("��ϲ�㣬��¼�ɹ���");
                            while (flag) {
                                System.out.println("-----------Welcome-----------");
                                System.out.println("��ѡ��Ҫ�����Ϸ��");
                                System.out.println("1 �齱");
                                System.out.println("2 ����");
                                System.out.println("3 ����");
                                System.out.println("4 ����");
                                System.out.println("5 �˳�");
                                break;
                            }
                        } else {
                            System.out.println("�û�����������������µ�¼��");
                        }
                        if (i == 3) {
                            System.out.println("������¼");
                            System.exit(0);
                        }
                    }
                    break;

                case 2:
                    System.out.println("������ע����û���");
                    System.out.print("ע���û�����");
                    String newusername = input.next();
                    System.out.print("���룺");
                    String newpassword = input.next();
                    user = userDao.regist(newusername, newpassword);
                    if (!"".equals(user.getUsername())) {
                        System.out.println("ע��ɹ�");
                    } else {
                        System.out.println("ע��ʧ��");
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
