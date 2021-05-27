package com.singerw.reg;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * �û�����һ���ַ������ж��Ƿ�����ֻ�����Ĺ���
 * �û�����һ���ַ������ж��Ƿ�������֤�Ĺ���
 *
 * @Author ����
 * @Date 2021-05-26 10:39
 */
public class TestReg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("������һ���ֻ���:");
        String iphoneNumber = input.next();
        System.out.println("������һ�����֤���룺");
        String idcade = input.next();

        boolean matches1 = Pattern.matches("\\d{3}-\\d{8}|\\d{4}-\\{7,8}", iphoneNumber);
        boolean matches2 = Pattern.matches("^(\\d{6})(\\d{4})(\\d{2})(\\d{2})(\\d{3})([0-9]|X)$", idcade);

        System.out.println(iphoneNumber + matches1);
        System.out.println(idcade + matches2);

    }
}
