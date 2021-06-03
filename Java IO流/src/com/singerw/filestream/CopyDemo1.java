package com.singerw.filestream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName: CopyDemo1
 * @Description: //TODO ������
 * @Author: CodeSleep
 * @Date: 2021-06-03 15:14
 * @Version: 1.0
 */
public class CopyDemo1 {
    public static void main(String[] args) throws IOException {
        // ����һ��file����
        String path = "G:\\IOtest\\IOtest.zip";
        File src = new File(path);
        // ����һ��FileInputStream
        FileInputStream fis = null;
        fis = new FileInputStream(src);
        System.out.println(src.length());
        System.out.println(fis.available());

        // �Ӵ��̶�ȡ�ļ����ڴ���
        byte[] b = new byte[(int)src.length()];
        fis.read(b);

        // ����һ��FileOutputStream
        String path2 = "G:\\IOtest\\temp\\test.zip";
        FileOutputStream fos = new FileOutputStream(path2);

        // д��
        fos.write(b);
        System.out.println("���Ƴɹ�");

        // �ر���
        fos.close();
        fis.close();

    }



}
