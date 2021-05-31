package com.singerw.map.book.dao;

import com.singerw.map.book.entity.BookEntity;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: BookDao
 * @Description: //TODO 查询，修改，删除，增加操作(ArrayList来存储)
 * @Author: CodeSleep
 * @Date: 2021-05-29 22:16
 * @Version: 1.0
 */
public class BookDao {

    /**
     * 创建一个Map来存储
     */
    private Map<String, BookEntity> map = new HashMap<String,BookEntity>();


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
        // 第一个参数是，book对象的id，第二个参数就是book对象
        // 判断是否存在相同的book对象
        if(map.containsKey(book.getBookid())){
            System.out.println("book已存在");
            return false;
        }
        map.put(book.getBookid(),book);
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
        if (map.containsKey(id)){
            map.remove(id);
            return true;
        }
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
        if (map.containsKey(id)){
            return map.get(id);
        }
        return null;
    }

    /**
     * @param book
     * @return
     * @Author: CodeSleep
     * @Date: 2021-05-31 9:27
     * @Description: //TODO 查找并修改集合中的元素
     */
    public boolean updateBook(BookEntity book) {
        if (map.containsKey(book.getBookid())){
            // 修改
            map.put(book.getBookid(),book);
            return true;
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
    public Map<String,BookEntity> getBookList() {
        return map;
    }
}
