package com.singerw.book.dao;

import java.io.*;
import java.util.Scanner;

/**
 * @ClassName: BookDao
 * @Description: //TODO ʹ��IO�������ͽӿڣ������������
 * �û��ӿ���̨����ͼ����Ϣ(bookid,bookname,bookauthor,bookprice),����Ϣ�洢���ļ���. ��(2)��
 * ���ļ��е�ͼ����Ϣ��ȡ�������ڿ���̨����ʵ�ֲ�ѯ���ܡ�
 * @Author: CodeSleep
 * @Date: 2021-06-03 21:55
 * @Version: 1.0
 */
public class BookDao {
    private static final String PATH_NAME = "I:\\IDEA2019_Project\\JavaSE����\\Java IO��С��ϰ\\src\\resources\\docs\\test.txt";

    /**
     * @throws IOException
     * @Author: CodeSleep
     * @Date: 2021-06-03 1:15
     * @Description: //TODO ��ȡ����
     */
    public void read() throws IOException {
        // ��1����ʹ��File���ҵ�һ���ļ�
        File src = new File(PATH_NAME);

        // ��2����ͨ������ʵ��������FileInputStream����
        InputStream input = new FileInputStream(src);

        // ��3�������ж�����
        byte[] b = new byte[(int) src.length()];
        // ��ȡ����
        int len = input.read(b);
        System.out.println("�������ݵĳ��ȣ�" + len);

        // ��4�����ر�������
        input.close();
    }

    /**
     * @Author: CodeSleep
     * @Date: 2021-06-04 1:11
     * @Description: //TODO д�����
     * @throws IOException
     */
    public void write() throws IOException {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 2; i++) {
            System.out.print("������ID:");
            int id = input.nextInt();
            System.out.print("����������:");
            String name = input.next();
            System.out.print("����������:");
            String author = input.next();
            System.out.print("������۸�:");
            int price = input.nextInt();


            FileOutputStream out = new FileOutputStream(PATH_NAME,true);
            String str = "Hello World\n";
            byte[] b = str.getBytes();
            out.write(b);
            System.out.println("д��ɹ�");
            out.close();
        }
        input.close();
    }

}
