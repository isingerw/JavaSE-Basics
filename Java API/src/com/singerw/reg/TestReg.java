package com.singerw.reg;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * 用户输入一个字符串，判断是否符合手机号码的规则
 * 用户输入一个字符串，判断是否符合身份证的规则
 *
 * @Author 张欣
 * @Date 2021-05-26 10:39
 */
public class TestReg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个手机号:");
        String iphoneNumber = input.next();
        System.out.println("请输入一个身份证号码：");
        String idcade = input.next();

        boolean matches1 = Pattern.matches("\\d{3}-\\d{8}|\\d{4}-\\{7,8}", iphoneNumber);
        boolean matches2 = Pattern.matches("^(\\d{6})(\\d{4})(\\d{2})(\\d{2})(\\d{3})([0-9]|X)$", idcade);

        System.out.println(iphoneNumber + matches1);
        System.out.println(idcade + matches2);

    }
}
