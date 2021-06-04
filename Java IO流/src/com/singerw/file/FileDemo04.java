package com.singerw.file;

import java.io.File;

/**
 * @ClassName: FileDemo04
 * @Description: //TODO �㼶����������Ŀ¼����Ŀ¼�����ļ�
 * @Author: CodeSleep
 * @Date: 2021-06-04 16:49
 * @Version: 1.0
 */
public class FileDemo04 {
    public static void main(String[] args) {
        File file = new File("I:\\IDEA2019_Project\\JavaSE����");
        // ���÷���
        showsFile(file);
    }

    /**
     * @Author: CodeSleep
     * @Date: 2021-06-04 16:50
     * @Description: //TODO ����file·���µ��ļ���Ŀ¼
     * @param file
     */
    private static void showsFile(File file) {
        // ����listfile����
        File[] files = file.listFiles();
        // û��Ȩ�� == null
        if (files !=null) {
            // ����
            for (File f : files) {
                // ���f���ļ��Ļ���ֱ�����
                if (f.isFile()) {
                    System.out.println("getAbsolutePath:" + f.getAbsolutePath());
                } else {
                    // ���f��Ŀ¼�Ļ���Ҫ����listFiles
                    showsFile(f);
                }
            }
        }
    }
}
