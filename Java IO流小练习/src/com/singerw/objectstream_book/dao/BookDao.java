package com.singerw.objectstream_book.dao;

import com.singerw.objectstream_book.entity.BookEntity;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
     * @Date: 2021-06-04 10:08
     * @Description: //TODO 写入图书数据
     */
    public void outPutBook() throws IOException {
        // 2 构造一个OutputStream
        OutputStream ops = new FileOutputStream(PATH_NAME);

        // 1 构造一个ObjectOutputStream
        ObjectOutputStream oos = new ObjectOutputStream(ops);

        enterBook();

        BookEntity book1 = new BookEntity(1, "Java从入门到放弃", "暂住证", 123.5);
        BookEntity book2 = new BookEntity(2, "架构之美", "阿斯顿", 150.5);
        BookEntity book3 = new BookEntity(3, "Python", "前卫", 13.5);

        // 3 负责写入（序列化）writeObject 参数是Object
        List<BookEntity> list = Arrays.asList(book1, book2, book3);
        // 要序列化对象，还要关联兑现：List==>BookEntity 都要实现序列化接口
        oos.writeObject(list);

        // 4 释放资源
        oos.close();
        ops.close();
    }


    /**
     * @Author: CodeSleep
     * @Date: 2021-06-04 11:04
     * @Description: //TODO 读取图书信息
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public void inPutBook() throws IOException, ClassNotFoundException {
        // 1 构造一个FileInputStream
        FileInputStream fis = new FileInputStream(PATH_NAME);

        // 2 构造一个ObjectInputStream
        ObjectInputStream ois = new ObjectInputStream(fis);

        // 3 负责读取（反序列化） readObject 返回Object
        Object obj = ois.readObject();
        List<BookEntity> list = null;
        if (obj instanceof List) {
            // 由于返回值Object存的时候是个List;
            list = (List<BookEntity>) obj;
            // 输出结果
            list.forEach(System.out::println);
        }

        // 4 释放资源
        ois.close();
        fis.close();

        // 调用searchMenu方法
        searchMenu(list);
    }


    /**
     * @Author: CodeSleep
     * @Date: 2021-06-04 11:00
     * @Description: //TODO 根据控制台输入的书名查询图书信息
     * @param list
     */
    public static void searchMenu(List<BookEntity> list) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入你要查询的图书的名称：");
        // 直接赋值
        String str = input.next();
        boolean flag = false;
        for (BookEntity book : list) {
            if (book.getBookName().equals(str)) {
                System.out.println("找到了：" + book);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("没有找到：" + str);
        }
        input.close();
    }

    /**
     * @Author: CodeSleep
     * @Date: 2021-06-04 11:04
     * @Description: //TODO 从控制台输入信息
     * @return
     */
    public static List<BookEntity> enterBook() {
        Scanner input = new Scanner(System.in);
        List<BookEntity> list = new ArrayList<BookEntity>();
        int i = 0;
        while (i <= 2){
            System.out.print("请输入ID:");
            int id = input.nextInt();
            System.out.print("请输入书名:");
            String name = input.next();
            System.out.print("请输入作者:");
            String author = input.next();
            System.out.print("请输入价格:");
            int price = input.nextInt();
            BookEntity book = new BookEntity(id,name,author,price);
            list.add(book);
        }
        return list;
    }
}
