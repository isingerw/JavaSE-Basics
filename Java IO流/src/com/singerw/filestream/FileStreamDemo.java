package com.singerw.filestream;

import java.io.*;

/**
 * @ClassName: FileStreamDemo
 * @Description: //TODO `FileOutputStream` �� `FileInputStream` �ļ���дʾ��
 * 1. ʹ�� `File` ���һ���ļ���
 * 2. �� `File` ����󶨵��������ϡ�
 * 3. ���ж���д������
 * 4. �ر���
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
     * @Description: //TODO �ļ�д�����
     * @param filepath
     * @throws IOException
     */
    public static void write(String filepath) throws IOException {
        // ��1����ʹ��File���ҵ�һ���ļ�
        File files = new File(filepath);

        // ��2����ͨ������ʵ��������FileOutputStream����
        OutputStream out = new FileOutputStream(files);
        // ʵ����ʱ��Ĭ��Ϊ����ԭ�ļ����ݷ�ʽ��������true���������Ϊ��ԭ�ļ�׷�����ݵķ�ʽ��
        // OutputStream out = new FileOutputStream(f, true);

        // ��3��������д����
        String str = "Hello World\n";
        byte[] b = str.getBytes();
        out.write(b);

        // ��4�����ر������
        out.close();
    }

    /**
     * @Author: CodeSleep
     * @Date: 2021-06-03 15:38
     * @Description: //TODO �ļ���ȡ����
     * @param filepath
     * @throws IOException
     */
    public static void read(String filepath) throws IOException {
        // ��1����ʹ��File���ҵ�һ���ļ�
        File files = new File(filepath);

        // ��2����ͨ������ʵ��������FileInputStream����
        InputStream input = new FileInputStream(files);

        // ��3�������ж�����
        byte[] b = new byte[(int) files.length()];
        // ��ȡ����
        int len = input.read(b);
        System.out.println("�������ݵĳ��ȣ�" + len);

        // ��4�����ر�������
        input.close();
    }
}
