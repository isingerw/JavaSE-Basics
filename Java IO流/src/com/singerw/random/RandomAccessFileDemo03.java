package com.singerw.random;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @ClassName: RandomAccessFileDemo
 * @Description: //TODO RandomAccessFileд���������
 * @Author: CodeSleep
 * @Date: 2021-06-03 11:24
 * @Version: 1.0
 */
public class RandomAccessFileDemo03 {
    public static void main(String[] args) throws IOException {
        String path = "I:\\IDEA2019_Project\\JavaSE����\\Java IO��\\src\\resources\\docs\\singer.txt";
        File src = new File(path);
        // ����RandomAccessFile��Ķ���
        RandomAccessFile raf = null;
        raf = new RandomAccessFile(src, "r");

        // �������
        raf.seek(4);
        byte[] b = new byte[9];
        // ��ȡ����
        raf.read(b);


        // ����һ��string���󣬲�����byte����
        String str = new String(b);
        System.out.println(str);

        raf.close();

    }
}
