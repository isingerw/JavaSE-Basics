package com.singerw.filestream;

import java.io.*;

/**
 * @ClassName: FileStreamDemo
 * @Description: //TODO `FileOutputStream` 和 `FileInputStream` 文件读写示例
 * 1. 使用 `File` 类绑定一个文件。
 * 2. 把 `File` 对象绑定到流对象上。
 * 3. 进行读或写操作。
 * 4. 关闭流
 * @Author: CodeSleep
 * @Date: 2021-06-03 15:37
 * @Version: 1.0
 */
public class FileStreamDemo {
    public static void main(String[] args) throws Exception {
        write("G:\\IOtest\\temp\\test.zip");
        read("G:\\IOtest\\IOtest.zip");
    }


    /**
     * @Author: CodeSleep
     * @Date: 2021-06-03 15:38
     * @Description: //TODO 文件写入操作
     * @param filepath
     * @throws IOException
     */
    public static void write(String filepath) throws IOException {
        // 第1步、使用File类找到一个文件
        File files = new File(filepath);

        // 第2步、通过子类实例化父类FileOutputStream对象
        OutputStream out = new FileOutputStream(files);
        // 实例化时，默认为覆盖原文件内容方式；如果添加true参数，则变为对原文件追加内容的方式。
        // OutputStream out = new FileOutputStream(f, true);

        // 第3步、进行写操作
        String str = "Hello World\n";
        byte[] b = str.getBytes();
        out.write(b);

        // 第4步、关闭输出流
        out.close();
    }

    /**
     * @Author: CodeSleep
     * @Date: 2021-06-03 15:38
     * @Description: //TODO 文件读取操作
     * @param filepath
     * @throws IOException
     */
    public static void read(String filepath) throws IOException {
        // 第1步、使用File类找到一个文件
        File files = new File(filepath);

        // 第2步、通过子类实例化父类FileInputStream对象
        InputStream input = new FileInputStream(files);

        // 第3步、进行读操作
        byte[] b = new byte[(int) files.length()];
        // 读取内容
        int len = input.read(b);
        System.out.println("读入数据的长度：" + len);

        // 第4步、关闭输入流
        input.close();
    }
}
