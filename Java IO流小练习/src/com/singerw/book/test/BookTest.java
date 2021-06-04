package com.singerw.book.test;

import com.singerw.book.dao.BookDao;

import java.io.IOException;

/**
 * @ClassName: BookTest
 * @Description: //TODO ¿‡√Ë ˆ
 * @Author: CodeSleep
 * @Date: 2021-06-03 21:56
 * @Version: 1.0
 */
public class BookTest {
    public static void main(String[] args) throws IOException {
        BookDao bd = new BookDao();
        bd.write();
        bd.read();
    }


}
