package com.singerw.random;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @ClassName: RandomAccessFileDemo
 * @Description: //TODO RandomAccessFile д����
 * ���� rw ��ʽ���� RandomAccessFile ����ʱ�����Ҫд����ļ������ڣ�ϵͳ�����д�����
 * rΪֻ����
 * wΪֻд��
 * rwΪ��д��
 * @Author: CodeSleep
 * @Date: 2021-06-03 11:24
 * @Version: 1.0
 */
public class RandomAccessFileDemo02 {
    public static void main(String[] args) throws IOException {
        String path = "I:\\IDEA2019_Project\\JavaSE����\\Java IO��\\src\\resources\\docs\\singer.txt";
        File src = new File(path);
        // ����RandomAccessFile��Ķ���
        RandomAccessFile raf = null;
        raf = new RandomAccessFile(src, "rw");

        // û�����κ�д�������λ��Ϊ0
        long pointer = raf.getFilePointer();
        System.out.println("pointer: "+ pointer);

        // ��д��
        // д��һ��int����
        int id = 123;
        raf.writeInt(id);
        // д��һ��int���ͣ�ռ4���ֽ�
        long pointer1 = raf.getFilePointer();
        System.out.println("pointer: "+ pointer1);

        // д��һ��string����
        // raf.writeUTF("hellojava"); �����������ַ���
        raf.write("hellojava".getBytes());
        // д��һ��String���ͣ�ռ9���ֽ�
        long pointer2 = raf.getFilePointer();
        System.out.println("pointer: "+ pointer2);

        // д������
        raf.write("����".getBytes());
        // д��һ���������ͣ�ռ2���ֽ�
        long pointer3 = raf.getFilePointer();
        System.out.println("pointer: "+ pointer3);

        System.out.println("д��ɹ�");
        raf.close();
    }
}
