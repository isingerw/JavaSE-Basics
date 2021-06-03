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
public class RandomAccessFileDemo03 {
    public static void main(String[] args) throws IOException {
        String path = "I:\\IDEA2019_Project\\JavaSE基础\\Java IO流\\src\\resources\\docs\\singer.txt";
        File src = new File(path);
        // 声明RandomAccessFile类的对象
        RandomAccessFile raf = null;
        raf = new RandomAccessFile(src, "r");

        // 可随机读
        raf.seek(4);
        byte[] b = new byte[9];
        // 读取方法
        raf.read(b);


        // 构造一个string对象，参数是byte数组
        String str = new String(b);
        System.out.println(str);

        raf.close();

    }
}
