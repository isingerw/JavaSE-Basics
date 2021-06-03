package com.singerw.writer_reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @ClassName: BufferedReaderDemo
 * @Description: //TODO 类描述
 * @Author: CodeSleep
 * @Date: 2021-06-03 9:37
 * @Version: 1.0
 */
public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("I:\\IDEA2019_Project\\JavaSE基础\\Java IO流\\src\\resources\\docs\\singer.txt");
        BufferedReader br = new BufferedReader(reader);

        // 一次读取一行
        String str = null;
        // str = br.readLine 读取一行并赋值给str对象
        // str!=null 判断是否为null;
        while ((str = br.readLine()) !=null){
            System.out.println(str);
        }
        // 关闭流
        br.close();
        reader.close();
    }
}
