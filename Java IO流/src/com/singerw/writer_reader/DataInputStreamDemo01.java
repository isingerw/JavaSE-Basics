package com.singerw.writer_reader;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @ClassName: DataInputStreamDemo01
 * @Description: //TODO �Ӵ��̶�����
 * @Author: CodeSleep
 * @Date: 2021-06-03 10:55
 * @Version: 1.0
 */
public class DataInputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("I:\\IDEA2019_Project\\JavaSE����\\Java IO��\\src\\resources\\docs\\singer.txt");
        DataInputStream dis = new DataInputStream(fis);
        System.out.println(dis.readUTF());
        System.out.println(dis.readInt());
        System.out.println(dis.readLong());
        System.out.println(dis.readChar());

        // �ر�
        dis.close();
        fis.close();
    }
}
