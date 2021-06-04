package com.singerw.objectstream_book.entity;

import java.io.Serializable;

/**
 * @ClassName: BookEntity
 * @Description: //TODO 使用IO流相关类和接口，完成输入和输出
 * 用户从控制台输入图书信息(bookid,bookname,bookauthor,bookprice),将信息存储到文件中. 多(2)本
 * 将文件中的图书信息读取出来，在控制台可以实现查询功能。
 * @Author: CodeSleep
 * @Date: 2021-06-03 21:55
 * @Version: 1.0
 */
public class BookEntity implements Serializable {

    private int bookId;
    private String bookName;
    private String bookAuthor;
    private double bookPrice;

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public BookEntity() {

    }



    public BookEntity(int bookId, String bookName, String bookAuthor, double bookPrice) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPrice = bookPrice;
    }

    @Override
    public String toString() {
        return "图书{" +
                "ISBN:" + bookId +
                ", 书名：'" + bookName + '\'' +
                ", 作者：'" + bookAuthor + '\'' +
                ", 价格：" + bookPrice +
                '}';
    }
}
