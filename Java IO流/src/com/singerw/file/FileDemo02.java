package com.singerw.file;

import java.io.File;

/**
 * @ClassName: FileDemo02
 * @Description: //TODO ���ĳ��·�����м������ļ���������Ŀ¼��һ����
 * @Author: CodeSleep
 * @Date: 2021-06-02 10:26
 * @Version: 1.0
 */
public class FileDemo02 {
    public static void main(String[] args) {
        // G:\2. JavaSE��һ�׶�
        File file = new File("G:\\2. JavaSE��һ�׶�");

        // ����listfile����
        File[] files = file.listFiles();
        // ����
        for (File f : files) {
            System.out.print(f.getAbsolutePath());
            System.out.print(f.isFile() ? "==>�ļ�" : "==>Ŀ¼");
            System.out.println();

            // ���f���ļ��Ļ���ֱ�����
            // ���f��Ŀ¼�Ļ���Ҫ����listFiles

        }
    }

}
