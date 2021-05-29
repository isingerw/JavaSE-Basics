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
     * @Author: CodeSleep
     * @Date: 2021-05-29 22:43
     * @Description: //TODO 添加书
     * @param book
     * @return
     */
    public boolean addBook(BookEntity book){
        //条件判断
        if (book == null){
            return false;
        }
        list.add(book);
        return true;
    }

    /**
     * @Author: CodeSleep
     * @Date: 2021-05-29 22:49
     * @Description: //TODO 查找并删除书
     * @param id
     * @return
     */
    public boolean deleteBook(String id){
        for (int i = 0; i < list.size(); i++) {
            // 将集合中已存在的元素，临时变量赋值给find
            BookEntity find = list.get(i);
            if (id.equals(find.getBookid())){
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
     * @Author: CodeSleep
     * @Date: 2021-05-29 22:55
     * @Description: //TODO 查找元素并返回查找结果
     * @param id
     * @return
     */
    public BookEntity getBookById(String id){
        for (int i = 0; i < list.size(); i++) {
            // 将集合中已存在的元素，赋值给临时变量find
            BookEntity find = list.get(i);
            if (id.equals(find.getBookid())){
                // 如果找到了这个元素返回这个元素，方法体结束
                return find;
            }
        }
        // 如果没有找到这个元素则返回null,方法体结束
        return null;
    }

    /**
     * @Author: CodeSleep
     * @Date: 2021-05-29 23:04
     * @Description: //TODO 查找并修改集合中的元素
     * @param id
     * @return
     */
    public BookEntity updateBookById(String id){
        for (int i = 0; i < list.size(); i++) {
            // 将结合中已存在的元素，赋值给临时变量find
            BookEntity find = list.get(i);
            if (id.equals(find.getBookid())){
                return find;
            }
        }
        return null;
    }

    /**
     * @Author: CodeSleep
     * @Date: 2021-05-29 23:03
     * @Description: //TODO 返回集合中所有的元素
     * @return list
     */
    public ArrayList<BookEntity> getBookList(){
        return list;
    }
}
