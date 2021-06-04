package com.singerw.writer_reader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @ClassName: ReaderDemo01
 * @Description: //TODO 类描述
 * @Author: CodeSleep
 * @Date: 2021-06-03 9:18
 * @Version: 1.0
 */
public class ReaderDemo01 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("I:\\IDEA2019_Project\\JavaSE基础\\Java IO流\\src\\resources\\docs\\singer.txt");
        File file = new File("I:\\IDEA2019_Project\\JavaSE基础\\Java IO流\\src\\resources\\docs\\singer.txt");

        char[] buff = new char[(int)file.length()];
        reader.read(buff,0, (int)buff.length);
        System.out.println();
    }
}
