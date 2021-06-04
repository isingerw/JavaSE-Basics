package com.singerw.objectstream_book.dao;

import com.singerw.objectstream_book.entity.BookEntity;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
     * @Date: 2021-06-04 10:08
     * @Description: //TODO д��ͼ������
     */
    public void outPutBook() throws IOException {
        // 2 ����һ��OutputStream
        OutputStream ops = new FileOutputStream(PATH_NAME);

        // 1 ����һ��ObjectOutputStream
        ObjectOutputStream oos = new ObjectOutputStream(ops);

        enterBook();

        BookEntity book1 = new BookEntity(1, "Java�����ŵ�����", "��ס֤", 123.5);
        BookEntity book2 = new BookEntity(2, "�ܹ�֮��", "��˹��", 150.5);
        BookEntity book3 = new BookEntity(3, "Python", "ǰ��", 13.5);

        // 3 ����д�루���л���writeObject ������Object
        List<BookEntity> list = Arrays.asList(book1, book2, book3);
        // Ҫ���л����󣬻�Ҫ�������֣�List==>BookEntity ��Ҫʵ�����л��ӿ�
        oos.writeObject(list);

        // 4 �ͷ���Դ
        oos.close();
        ops.close();
    }


    /**
     * @Author: CodeSleep
     * @Date: 2021-06-04 11:04
     * @Description: //TODO ��ȡͼ����Ϣ
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public void inPutBook() throws IOException, ClassNotFoundException {
        // 1 ����һ��FileInputStream
        FileInputStream fis = new FileInputStream(PATH_NAME);

        // 2 ����һ��ObjectInputStream
        ObjectInputStream ois = new ObjectInputStream(fis);

        // 3 �����ȡ�������л��� readObject ����Object
        Object obj = ois.readObject();
        List<BookEntity> list = null;
        if (obj instanceof List) {
            // ���ڷ���ֵObject���ʱ���Ǹ�List;
            list = (List<BookEntity>) obj;
            // ������
            list.forEach(System.out::println);
        }

        // 4 �ͷ���Դ
        ois.close();
        fis.close();

        // ����searchMenu����
        searchMenu(list);
    }


    /**
     * @Author: CodeSleep
     * @Date: 2021-06-04 11:00
     * @Description: //TODO ���ݿ���̨�����������ѯͼ����Ϣ
     * @param list
     */
    public static void searchMenu(List<BookEntity> list) {
        Scanner input = new Scanner(System.in);
        System.out.print("��������Ҫ��ѯ��ͼ������ƣ�");
        // ֱ�Ӹ�ֵ
        String str = input.next();
        boolean flag = false;
        for (BookEntity book : list) {
            if (book.getBookName().equals(str)) {
                System.out.println("�ҵ��ˣ�" + book);
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("û���ҵ���" + str);
        }
        input.close();
    }

    /**
     * @Author: CodeSleep
     * @Date: 2021-06-04 11:04
     * @Description: //TODO �ӿ���̨������Ϣ
     * @return
     */
    public static List<BookEntity> enterBook() {
        Scanner input = new Scanner(System.in);
        List<BookEntity> list = new ArrayList<BookEntity>();
        int i = 0;
        while (i <= 2){
            System.out.print("������ID:");
            int id = input.nextInt();
            System.out.print("����������:");
            String name = input.next();
            System.out.print("����������:");
            String author = input.next();
            System.out.print("������۸�:");
            int price = input.nextInt();
            BookEntity book = new BookEntity(id,name,author,price);
            list.add(book);
        }
        return list;
    }
}
