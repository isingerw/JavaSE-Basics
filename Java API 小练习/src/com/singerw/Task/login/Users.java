package com.singerw.Task.login;

import java.util.Scanner;

public class Users {
    private String userNema = "singerw";
    private String passWord = "123456";

    /**
     * ����������û���������
     */
    public void userName(){
        Scanner inputuser = new Scanner(System.in);
        Scanner inputpass = new Scanner(System.in);
        for (int i = 2; i >=0 ; i--) {
            System.out.print("�������û�����");
            String username = inputuser.nextLine();
            System.out.print("���������룺");
            String password = inputpass.nextLine();
            if (username.equals(userNema) && password.equals(passWord)){
                System.out.println("�û���½�ɹ���");
                break;
            }else if (i == 0) {
                System.out.println("��¼ʧ�ܣ����Ѿ�û�������µ�¼��");
            } else {
                System.out.println("��¼ʧ�ܣ�������" + i + "�λ��ᣬ�����µ�½��");
            }
        }
    }

    // ��֤��ʵ�ֵ�¼
    public void login(){
        userName();
    }

}

