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
public class RandomAccessFileDemo05 {
    public static void main(String[] args) throws IOException {
        // ����RandomAccessFile��Ķ���
        String path = "I:\\IDEA2019_Project\\JavaSE����\\Java IO��\\src\\resources\\docs\\singer.txt";
        File src = new File(path);
        RandomAccessFile raf = null;
        raf = new RandomAccessFile(src,"r");

        // �������
        raf.seek(4);
        byte [] bytes = new byte[14];
        raf.read(bytes);
        // ��ȡ����
        String str = new String(bytes);
        System.out.println(str);

        // ����һ��string���󣬲�����byte����
        raf.close();

    }
}
