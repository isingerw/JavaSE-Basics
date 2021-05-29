package com.singerw.book.entity;

/**
 * @ClassName: BookEntity
 * @Description: //TODO ���Book�Ĺ�����ѯ���޸ģ�ɾ�������Ӳ���(ArrayList���洢)
 * @Author: CodeSleep
 * @Date: 2021-05-29 22:16
 * @Version: 1.0
 */
public class BookEntity {

    private String bookid;
    private String title;
    private String writer;
    private double price;

    public String getBookid() {
        return bookid;
    }

    public void setBookid(String bookid) {
        this.bookid = bookid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public BookEntity() {
    }

    public BookEntity(String bookid, String title, String writer, double price) {
        this.bookid = bookid;
        this.title = title;
        this.writer = writer;
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookDao{" +
                "ISBN:" + bookid +
                ", ������'" + title + '\'' +
                ", ����: '" + writer + '\'' +
                ", �۸�: " + price +
                '}';
    }
}
