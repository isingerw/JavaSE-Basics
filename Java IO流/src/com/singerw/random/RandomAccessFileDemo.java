package com.singerw.random;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @ClassName: RandomAccessFileDemo
 * @Description: //TODO ������
 * @Author: CodeSleep
 * @Date: 2021-06-03 11:24
 * @Version: 1.0
 */
public class RandomAccessFileDemo {
    public static void main(String args[]) throws IOException {
        // ָ��Ҫ�������ļ�
        File f = new File("d:" + File.separator + "test.txt");
        // ����RandomAccessFile��Ķ���
        RandomAccessFile rdf = null;
        // ��дģʽ������ļ������ڣ����Զ�����
        rdf = new RandomAccessFile(f, "rw");
        String name = null;
        int age = 0;
        // �ַ�������Ϊ8
        name = "zhangsan";
        // ���ֵĳ���Ϊ4
        age = 30;
        // ������д���ļ�֮��
        rdf.writeBytes(name);
        // ������д���ļ�֮��
        rdf.writeInt(age);
        // �ַ�������Ϊ8
        name = "lisi";
        // ���ֵĳ���Ϊ4
        age = 31;
        // ������д���ļ�֮��
        rdf.writeBytes(name);
        // ������д���ļ�֮��
        rdf.writeInt(age);
        // �ַ�������Ϊ8
        name = "wangwu  ";
        // ���ֵĳ���Ϊ4
        age = 32;
        // ������д���ļ�֮��
        rdf.writeBytes(name);
        // ������д���ļ�֮��
        rdf.writeInt(age);
        // �ر�
        rdf.close();
    }
}
