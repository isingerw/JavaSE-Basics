package com.singerw.book.test;

import com.singerw.book.dao.BookDao;
import com.singerw.book.entity.BookEntity;

import java.util.ArrayList;

/**
 * @ClassName: BookTest
 * @Description: //TODO Book测试类
 * @Author: CodeSleep
 * @Date: 2021-05-29 22:16
 * @Version: 1.0
 */
public class BookTest {
    public static void main(String[] args) {
        // 实例化BookDao对象
        BookDao bookDao = new BookDao();
        // 定义一个集合用于存放
        ArrayList<BookEntity> list = new ArrayList<>();


        // 1、添加操作
        // String bookid, String title, String writer, double price
        BookEntity book1 = new BookEntity("876-3-123-232572-5","Java开发者手册","孙雪莹",45.00);
        BookEntity book2 = new BookEntity("345-2-432-123452-4","神的操作","里尔",78.00);
        BookEntity book3 = new BookEntity("123-5-321-768954-2","用户手册","张虎",23.00);
        BookEntity book4 = new BookEntity("467-1-876-987645-1","醉风堂主","宋三",123.00);
        // 调用bookDao中的addBook方法将元素添加至集合中
        bookDao.addBook(book1);
        bookDao.addBook(book2);
        bookDao.addBook(book3);
        bookDao.addBook(book4);
        // 添加后输出集合
        System.out.println("———————————————————————————————添加后———————————————————————————————");
        list =bookDao.getBookList();
        if (list.isEmpty()){
            System.out.println("集合中无元素");
        }else {
            list.forEach(System.out::println);
        }


        // 2、删除操作
        System.out.println("———————————————————————————————删除前———————————————————————————————");
        // 删除前输出集合元素
        list = bookDao.getBookList();
        if (list.isEmpty()) {
            System.out.println("集合中无数据");
        } else {
            list.forEach(System.out::println);
        }

        System.out.println("———————————————————————————————删除前———————————————————————————————");
        // 调用BookDao方法进行删除操作
        bookDao.deleteBook("876-3-123-232572-5");
        // 删除前输出集合元素
        list = bookDao.getBookList();
        if (list.isEmpty()) {
            System.out.println("集合中无数据");
        } else {
            list.forEach(System.out::println);
        }


        // 3、查询操作
        // 调用bookDao中的getBookById方法查询
        System.out.println("———————————————————————————————查询———————————————————————————————");
        System.out.println(bookDao.getBookById("123-5-321-768954-2"));
        System.out.println(bookDao.getBookById("876-3-1-5"));


        // 4、修改操作
        // 修改前输出
        System.out.println("———————————————————————————————修改前———————————————————————————————");
        list =bookDao.getBookList();
        if (list.isEmpty()){
            System.out.println("集合中无元素");
        }else {
            list.forEach(System.out::println);
        }

        // 调用bookDao中的update方法进行修改操作
        System.out.println(bookDao.updateBookById("123-5-321-768954-2"));
        // 修改后操作
        System.out.println("———————————————————————————————修改前———————————————————————————————");
        list =bookDao.getBookList();
        if (list.isEmpty()){
            System.out.println("集合中无元素");
        }else {
            list.forEach(System.out::println);
        }

    }

}
