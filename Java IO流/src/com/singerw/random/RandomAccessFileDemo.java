package com.singerw.random;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @ClassName: RandomAccessFileDemo
 * @Description: //TODO 类描述
 * @Author: CodeSleep
 * @Date: 2021-06-03 11:24
 * @Version: 1.0
 */
public class RandomAccessFileDemo {
    public static void main(String args[]) throws IOException {
        // 指定要操作的文件
        File f = new File("d:" + File.separator + "test.txt");
        // 声明RandomAccessFile类的对象
        RandomAccessFile rdf = null;
        // 读写模式，如果文件不存在，会自动创建
        rdf = new RandomAccessFile(f, "rw");
        String name = null;
        int age = 0;
        // 字符串长度为8
        name = "zhangsan";
        // 数字的长度为4
        age = 30;
        // 将姓名写入文件之中
        rdf.writeBytes(name);
        // 将年龄写入文件之中
        rdf.writeInt(age);
        // 字符串长度为8
        name = "lisi";
        // 数字的长度为4
        age = 31;
        // 将姓名写入文件之中
        rdf.writeBytes(name);
        // 将年龄写入文件之中
        rdf.writeInt(age);
        // 字符串长度为8
        name = "wangwu  ";
        // 数字的长度为4
        age = 32;
        // 将姓名写入文件之中
        rdf.writeBytes(name);
        // 将年龄写入文件之中
        rdf.writeInt(age);
        // 关闭
        rdf.close();
    }
}
