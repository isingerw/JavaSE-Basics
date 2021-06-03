package com.singerw.writer_reader;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ClassName: DateOutputWriterDemo01
 * @Description: //TODO 写入数据
 * @Author: CodeSleep
 * @Date: 2021-06-03 10:48
 * @Version: 1.0
 */
public class DataOutputStreamDemo01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("I:\\IDEA2019_Project\\JavaSE基础\\Java IO流\\src\\resources\\docs\\singer.txt");
        DataOutputStream dos = new DataOutputStream(fos);

        // 使用dos方法
        dos.writeUTF("张小娴");
        dos.writeInt(23);
        dos.writeLong(123232);
        dos.writeChars("zhang");
        System.out.println("写入成功");

        // 关闭
        dos.close();
        fos.close();
    }
}
