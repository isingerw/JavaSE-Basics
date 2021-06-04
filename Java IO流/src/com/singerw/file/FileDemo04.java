package com.singerw.file;

import java.io.File;

/**
 * @ClassName: FileDemo04
 * @Description: //TODO 层级遍历，遍历目录和子目录及其文件
 * @Author: CodeSleep
 * @Date: 2021-06-04 16:49
 * @Version: 1.0
 */
public class FileDemo04 {
    public static void main(String[] args) {
        File file = new File("I:\\IDEA2019_Project\\JavaSE基础");
        // 调用方法
        showsFile(file);
    }

    /**
     * @Author: CodeSleep
     * @Date: 2021-06-04 16:50
     * @Description: //TODO 遍历file路径下的文件和目录
     * @param file
     */
    private static void showsFile(File file) {
        // 调用listfile方法
        File[] files = file.listFiles();
        // 没有权限 == null
        if (files !=null) {
            // 遍历
            for (File f : files) {
                // 如果f是文件的话，直接输出
                if (f.isFile()) {
                    System.out.println("getAbsolutePath:" + f.getAbsolutePath());
                } else {
                    // 如果f是目录的话，要继续listFiles
                    showsFile(f);
                }
            }
        }
    }
}
