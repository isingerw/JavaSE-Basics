package com.singerw.writer_reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @ClassName: BufferReaderDemo02
 * @Description: //TODO 类描述
 * @Author: CodeSleep
 * @Date: 2021-06-03 10:16
 * @Version: 1.0
 */
public class BufferReaderDemo02 {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("I:\\IDEA2019_Project\\JavaSE基础\\Java IO流\\src\\resources\\docs\\singer.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);

        // 一次读取一行
        String str = null;
        while ((str = bufferedReader.readLine()) != null) {
            System.out.println(str);
        }

        reader.close();
        bufferedReader.close();

    }
}
