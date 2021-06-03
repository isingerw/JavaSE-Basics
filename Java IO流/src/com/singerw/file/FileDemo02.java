package com.singerw.file;

import java.io.File;

/**
 * @ClassName: FileDemo02
 * @Description: //TODO 输出某个路径下有几个子文件，几个子目录（一级）
 * @Author: CodeSleep
 * @Date: 2021-06-02 10:26
 * @Version: 1.0
 */
public class FileDemo02 {
    public static void main(String[] args) {
        // G:\2. JavaSE第一阶段
        File file = new File("G:\\2. JavaSE第一阶段");

        // 调用listfile方法
        File[] files = file.listFiles();
        // 遍历
        for (File f : files) {
            System.out.print(f.getAbsolutePath());
            System.out.print(f.isFile() ? "==>文件" : "==>目录");
            System.out.println();

            // 如果f是文件的话，直接输出
            // 如果f是目录的话，要继续listFiles

        }
    }

}
