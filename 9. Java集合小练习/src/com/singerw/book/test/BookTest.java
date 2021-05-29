package com.singerw.book.test;

import com.singerw.book.dao.BookDao;
import com.singerw.book.entity.BookEntity;

import java.util.ArrayList;

/**
 * @ClassName: BookTest
 * @Description: //TODO Book������
 * @Author: CodeSleep
 * @Date: 2021-05-29 22:16
 * @Version: 1.0
 */
public class BookTest {
    public static void main(String[] args) {
        // ʵ����BookDao����
        BookDao bookDao = new BookDao();
        // ����һ���������ڴ��
        ArrayList<BookEntity> list = new ArrayList<>();


        // 1����Ӳ���
        // String bookid, String title, String writer, double price
        BookEntity book1 = new BookEntity("876-3-123-232572-5","Java�������ֲ�","��ѩӨ",45.00);
        BookEntity book2 = new BookEntity("345-2-432-123452-4","��Ĳ���","���",78.00);
        BookEntity book3 = new BookEntity("123-5-321-768954-2","�û��ֲ�","�Ż�",23.00);
        BookEntity book4 = new BookEntity("467-1-876-987645-1","�������","����",123.00);
        // ����bookDao�е�addBook������Ԫ�������������
        bookDao.addBook(book1);
        bookDao.addBook(book2);
        bookDao.addBook(book3);
        bookDao.addBook(book4);
        // ��Ӻ��������
        System.out.println("����������������������������������������������������������������Ӻ󡪡�����������������������������������������������������������");
        list =bookDao.getBookList();
        if (list.isEmpty()){
            System.out.println("��������Ԫ��");
        }else {
            list.forEach(System.out::println);
        }


        // 2��ɾ������
        System.out.println("��������������������������������������������������������������ɾ��ǰ��������������������������������������������������������������");
        // ɾ��ǰ�������Ԫ��
        list = bookDao.getBookList();
        if (list.isEmpty()) {
            System.out.println("������������");
        } else {
            list.forEach(System.out::println);
        }

        System.out.println("��������������������������������������������������������������ɾ��ǰ��������������������������������������������������������������");
        // ����BookDao��������ɾ������
        bookDao.deleteBook("876-3-123-232572-5");
        // ɾ��ǰ�������Ԫ��
        list = bookDao.getBookList();
        if (list.isEmpty()) {
            System.out.println("������������");
        } else {
            list.forEach(System.out::println);
        }


        // 3����ѯ����
        // ����bookDao�е�getBookById������ѯ
        System.out.println("����������������������������������������������������������������ѯ��������������������������������������������������������������");
        System.out.println(bookDao.getBookById("123-5-321-768954-2"));
        System.out.println(bookDao.getBookById("876-3-1-5"));


        // 4���޸Ĳ���
        // �޸�ǰ���
        System.out.println("���������������������������������������������������������������޸�ǰ��������������������������������������������������������������");
        list =bookDao.getBookList();
        if (list.isEmpty()){
            System.out.println("��������Ԫ��");
        }else {
            list.forEach(System.out::println);
        }

        // ����bookDao�е�update���������޸Ĳ���
        System.out.println(bookDao.updateBookById("123-5-321-768954-2"));
        // �޸ĺ����
        System.out.println("���������������������������������������������������������������޸�ǰ��������������������������������������������������������������");
        list =bookDao.getBookList();
        if (list.isEmpty()){
            System.out.println("��������Ԫ��");
        }else {
            list.forEach(System.out::println);
        }

    }

}
