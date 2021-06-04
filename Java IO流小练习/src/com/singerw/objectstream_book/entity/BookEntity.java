package com.singerw.objectstream_book.entity;

import java.io.Serializable;

/**
 * @ClassName: BookEntity
 * @Description: //TODO ʹ��IO�������ͽӿڣ������������
 * �û��ӿ���̨����ͼ����Ϣ(bookid,bookname,bookauthor,bookprice),����Ϣ�洢���ļ���. ��(2)��
 * ���ļ��е�ͼ����Ϣ��ȡ�������ڿ���̨����ʵ�ֲ�ѯ���ܡ�
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
        return "ͼ��{" +
                "ISBN:" + bookId +
                ", ������'" + bookName + '\'' +
                ", ���ߣ�'" + bookAuthor + '\'' +
                ", �۸�" + bookPrice +
                '}';
    }
}
