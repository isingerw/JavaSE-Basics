package com.singerw.file;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName: FileDemo
 * @Description: //TODO ??????
 * @Author: CodeSleep
 * @Date: 2021-06-02 10:09
 * @Version: 1.0
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("I:\\IDEA2019_Project\\JavaSE????\\Java IO??\\src\\resources\\docs\\singer.txt");

        // ??????
        System.out.println(file.exists());
        // ???????????
        System.out.println(file.delete());

        if (file.exists()) {
            System.out.println("Delete:" + file.delete());
        } else {
            System.out.println("createNewFile:" + file.createNewFile());
        }
    }
}
