package com.singerw.random;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @ClassName: RandomAccessFileDemo
 * @Description: //TODO RandomAccessFile 写操作
 * 当用 rw 方式声明 RandomAccessFile 对象时，如果要写入的文件不存在，系统将自行创建。
 * r为只读；
 * w为只写；
 * rw为读写。
 * @Author: CodeSleep
 * @Date: 2021-06-03 11:24
 * @Version: 1.0
 */
public class RandomAccessFileDemo02 {
    public static void main(String[] args) throws IOException {
        String path = "I:\\IDEA2019_Project\\JavaSE基础\\Java IO流\\src\\resources\\docs\\singer.txt";
        File src = new File(path);
        // 声明RandomAccessFile类的对象
        RandomAccessFile raf = null;
        raf = new RandomAccessFile(src, "rw");

        // 没进行任何写入操作，位置为0
        long pointer = raf.getFilePointer();
        System.out.println("pointer: "+ pointer);

        // 可写入
        // 写入一个int类型
        int id = 123;
        raf.writeInt(id);
        // 写入一个int类型，占4个字节
        long pointer1 = raf.getFilePointer();
        System.out.println("pointer: "+ pointer1);

        // 写入一个string类型
        // raf.writeUTF("hellojava"); 基本不用这种方法
        raf.write("hellojava".getBytes());
        // 写入一个String类型，占9个字节
        long pointer2 = raf.getFilePointer();
        System.out.println("pointer: "+ pointer2);

        // 写入中文
        raf.write("中文".getBytes());
        // 写入一个中文类型，占2个字节
        long pointer3 = raf.getFilePointer();
        System.out.println("pointer: "+ pointer3);

        System.out.println("写入成功");
        raf.close();
    }
}
