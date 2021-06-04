package com.singerw.objectstream_book.test;

import com.singerw.objectstream_book.dao.BookDao;

import java.io.IOException;

/**
 * @ClassName: BookTest
 * @Description: //TODO ¿‡√Ë ˆ
 * @Author: CodeSleep
 * @Date: 2021-06-03 21:56
 * @Version: 1.0
 */
public class BookTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        BookDao bookDao = new BookDao();
        bookDao.outPutBook();
        bookDao.inPutBook();
    }


}
