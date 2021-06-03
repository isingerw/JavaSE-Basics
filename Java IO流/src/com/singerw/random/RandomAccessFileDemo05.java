package com.singerw.random;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @ClassName: RandomAccessFileDemo
 * @Description: //TODO RandomAccessFile写入输出操作
 * @Author: CodeSleep
 * @Date: 2021-06-03 11:24
 * @Version: 1.0
 */
public class RandomAccessFileDemo05 {
    public static void main(String[] args) throws IOException {
        // 声明RandomAccessFile类的对象
        String path = "I:\\IDEA2019_Project\\JavaSE基础\\Java IO流\\src\\resources\\docs\\singer.txt";
        File src = new File(path);
        RandomAccessFile raf = null;
        raf = new RandomAccessFile(src,"r");

        // 可随机读
        raf.seek(4);
        byte [] bytes = new byte[14];
        raf.read(bytes);
        // 读取方法
        String str = new String(bytes);
        System.out.println(str);

        // 构造一个string对象，参数是byte数组
        raf.close();

    }
}
