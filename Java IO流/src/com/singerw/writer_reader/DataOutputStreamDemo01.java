package com.singerw.writer_reader;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName: DateOutputWriterDemo01
 * @Description: //TODO д������
 * @Author: CodeSleep
 * @Date: 2021-06-03 10:48
 * @Version: 1.0
 */
public class DataOutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("I:\\IDEA2019_Project\\JavaSE����\\Java IO��\\src\\resources\\docs\\singer.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        // ʹ��dos����
        dos.writeUTF("��С�");
        dos.writeInt(23);
        dos.writeLong(123232);
        dos.writeChars("zhang");
        System.out.println("д��ɹ�");

        // �ر�
        dos.close();
        fos.close();
    }
}
