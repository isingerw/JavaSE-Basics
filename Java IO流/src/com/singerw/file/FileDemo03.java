package com.singerw.file;

import java.io.File;

/**
 * @ClassName: FileDemo03
 * @Description: //TODO 类描述
 * @Author: CodeSleep
 * @Date: 2021-06-02 10:49
 * @Version: 1.0
 */
public class FileDemo03 {
    public static void main(String[] args) {
        File file = new File("I:\\IDEA2019_Project\\JavaSE基础\\Java IO流\\src\\resources\\docs\\singer.txt");

        System.out.println(file.length());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getName());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

        System.out.println("***********************");
        File file1 = new File("zhangsingerw.txt");
        // 得到绝对路径
        System.out.println(file1.getAbsoluteFile());
        System.out.println(file1.getName());
    }
}
