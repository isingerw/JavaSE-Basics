package com.singerw.file;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName: FileDemo
 * @Description: //TODO 类描述
 * @Author: CodeSleep
 * @Date: 2021-06-02 10:09
 * @Version: 1.0
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("I:\\IDEA2019_Project\\JavaSE基础\\Java IO流\\src\\resources\\docs\\singer.txt");

        // 是否存在
        System.out.println(file.exists());
        // 存在后删除文件
        System.out.println(file.delete());

        if (file.exists()) {
            System.out.println("Delete:" + file.delete());
        } else {
            System.out.println("createNewFile:" + file.createNewFile());
        }
    }
}
