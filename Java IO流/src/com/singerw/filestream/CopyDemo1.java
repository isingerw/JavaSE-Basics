package com.singerw.filestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName: CopyDemo1
 * @Description: //TODO 类描述
 * @Author: CodeSleep
 * @Date: 2021-06-03 15:14
 * @Version: 1.0
 */
public class CopyDemo1 {
    public static void main(String[] args) throws IOException {
        // 创建一个file对象
        String path = "G:\\IOtest\\IOtest.zip";
        File src = new File(path);
        // 创建一个FileInputStream
        FileInputStream fis = null;
        fis = new FileInputStream(src);
        System.out.println(src.length());
        System.out.println(fis.available());

        // 从磁盘读取文件到内存中
        byte[] b = new byte[(int)src.length()];
        fis.read(b);

        // 创建一个FileOutputStream
        String path2 = "G:\\IOtest\\temp\\test.zip";
        FileOutputStream fos = new FileOutputStream(path2);

        // 写入
        fos.write(b);
        System.out.println("复制成功");

        // 关闭流
        fos.close();
        fis.close();

    }



}
