package com.singerw.file;

import java.io.File;

/**
 * @ClassName: FileMkdirDemo
 * @Description: //TODO ������
 * @Author: CodeSleep
 * @Date: 2021-06-02 11:23
 * @Version: 2.0
 */
public class FileMkdirDemo {
    public static void main(String[] args) {
        File file = new File("I:\\IDEA2019_Project\\JavaSE����\\Java IO��\\src\\resources\\a\\b\\c");
        if (file.exists()){
            System.out.println(file.mkdirs());
        }
    }
}
