package com.singerw.file;

import java.io.File;

/**
 * @ClassName: FileMkdirDemo
 * @Description: //TODO ÀàÃèÊö
 * @Author: CodeSleep
 * @Date: 2021-06-02 11:23
 * @Version: 2.0
 */
public class FileMkdirDemo {
    public static void main(String[] args) {
        File file = new File("I:\\IDEA2019_Project\\JavaSE»ù´¡\\Java IOÁ÷\\src\\resources\\a\\b\\c");
        if (file.exists()){
            System.out.println(file.mkdirs());
        }
    }
}
