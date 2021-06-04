package com.singerw.book.dao;

import java.io.*;
import java.util.Scanner;

/**
 * @ClassName: BookDao
 * @Description: //TODO 使用IO流相关类和接口，完成输入和输出
 * 用户从控制台输入图书信息(bookid,bookname,bookauthor,bookprice),将信息存储到文件中. 多(2)本
 * 将文件中的图书信息读取出来，在控制台可以实现查询功能。
 * @Author: CodeSleep
 * @Date: 2021-06-03 21:55
 * @Version: 1.0
 */
public class BookDao {
    private static final String PATH_NAME = "I:\\IDEA2019_Project\\JavaSE基础\\Java IO流小练习\\src\\resources\\docs\\test.txt";

    /**
     * @throws IOException
     * @Author: CodeSleep
     * @Date: 2021-06-03 1:15
     * @Description: //TODO 读取操作
     */
    public void read() throws IOException {
        // 第1步、使用File类找到一个文件
        File src = new File(PATH_NAME);

        // 第2步、通过子类实例化父类FileInputStream对象
        InputStream input = new FileInputStream(src);

        // 第3步、进行读操作
        byte[] b = new byte[(int) src.length()];
        // 读取内容
        int len = input.read(b);
        System.out.println("读入数据的长度：" + len);

        // 第4步、关闭输入流
        input.close();
    }

    /**
     * @Author: CodeSleep
     * @Date: 2021-06-04 1:11
     * @Description: //TODO 写入操作
     * @throws IOException
     */
    public void write() throws IOException {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 2; i++) {
            System.out.print("请输入ID:");
            int id = input.nextInt();
            System.out.print("请输入书名:");
            String name = input.next();
            System.out.print("请输入作者:");
            String author = input.next();
            System.out.print("请输入价格:");
            int price = input.nextInt();


            FileOutputStream out = new FileOutputStream(PATH_NAME,true);
            String str = "Hello World\n";
            byte[] b = str.getBytes();
            out.write(b);
            System.out.println("写入成功");
            out.close();
        }
        input.close();
    }

}
