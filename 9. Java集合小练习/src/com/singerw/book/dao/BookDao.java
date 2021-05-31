package com.singerw.book.dao;

import com.singerw.book.entity.BookEntity;

import java.util.ArrayList;

/**
 * @ClassName: BookDao
 * @Description: //TODO 查询，修改，删除，增加操作(ArrayList来存储)
 * @Author: CodeSleep
 * @Date: 2021-05-29 22:16
 * @Version: 1.0
 */
public class BookDao {

    /**
     * ArrayList来存储
     */
    ArrayList<BookEntity> list = new ArrayList<>();


    // 增加、删除、修改、查询操作

    /**
     * @param book
     * @return
     * @Author: CodeSleep
     * @Date: 2021-05-29 22:43
     * @Description: //TODO 添加书
     */
    public boolean addBook(BookEntity book) {
        //条件判断
        if (book == null) {
            return false;
        }
        list.add(book);
        return true;
    }

    /**
     * @param id
     * @return
     * @Author: CodeSleep
     * @Date: 2021-05-29 22:49
     * @Description: //TODO 查找并删除书
     */
    public boolean deleteBook(String id) {
        for (int i = 0; i < list.size(); i++) {
            // 将集合中已存在的元素，临时变量赋值给find
            BookEntity find = list.get(i);
            if (id.equals(find.getBookid())) {
                // 如果找到了删除这个元素
                list.remove(i);
                // 删除后，执行到return，方法体结束
                return true;
            }
        }
        // 如果没找到也没有做删除操作，则返回false,方法体结束
        return false;
    }

    /**
     * @param id
     * @return
     * @Author: CodeSleep
     * @Date: 2021-05-29 22:55
     * @Description: //TODO 查找元素并返回查找结果
     */
    public BookEntity getBookById(String id) {
        for (int i = 0; i < list.size(); i++) {
            // 将集合中已存在的元素，赋值给临时变量find
            BookEntity find = list.get(i);
            if (id.equals(find.getBookid())) {
                // 如果找到了这个元素返回这个元素，方法体结束
                return find;
            }
        }
        // 如果没有找到这个元素则返回null,方法体结束
        return null;
    }

    /**
     * @Author: CodeSleep
     * @Date: 2021-05-31 9:27
     * @Description: //TODO 查找并修改集合中的元素
     * @param book
     * @return
     */
    public boolean updateBook(BookEntity book) {
        // 根据id查询是否包含这个p对象
        for (int i = 0; i < list.size(); i++) {
            // 集合中的元素 赋值给临时变量 find
            BookEntity find = list.get(i);
            if (book.getBookid().equals(find.getBookid())) {
                //用新的 p对象 把 pfind给替换掉
                list.set(i, book);
                // 如果执行到了return 那么方法结束
                return true;
            }
        }
        // 修改失败
        return false;
    }

    /**
     * @return
     * @Author: CodeSleep
     * @Date: 2021-05-30 16:18
     * @Description: //TODO
     */
    public ArrayList<BookEntity> getBookList() {
        return list;
    }
}
