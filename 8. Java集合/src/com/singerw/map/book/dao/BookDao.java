package com.singerw.map.book.dao;

import com.singerw.map.book.entity.BookEntity;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: BookDao
 * @Description: //TODO ��ѯ���޸ģ�ɾ�������Ӳ���(ArrayList���洢)
 * @Author: CodeSleep
 * @Date: 2021-05-29 22:16
 * @Version: 1.0
 */
public class BookDao {

    /**
     * ����һ��Map���洢
     */
    private Map<String, BookEntity> map = new HashMap<String,BookEntity>();


    // ���ӡ�ɾ�����޸ġ���ѯ����

    /**
     * @param book
     * @return
     * @Author: CodeSleep
     * @Date: 2021-05-29 22:43
     * @Description: //TODO �����
     */
    public boolean addBook(BookEntity book) {
        //�����ж�
        if (book == null) {
            return false;
        }
        // ��һ�������ǣ�book�����id���ڶ�����������book����
        // �ж��Ƿ������ͬ��book����
        if(map.containsKey(book.getBookid())){
            System.out.println("book�Ѵ���");
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
     * @Description: //TODO ���Ҳ�ɾ����
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
     * @Description: //TODO ����Ԫ�ز����ز��ҽ��
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
     * @Description: //TODO ���Ҳ��޸ļ����е�Ԫ��
     */
    public boolean updateBook(BookEntity book) {
        if (map.containsKey(book.getBookid())){
            // �޸�
            map.put(book.getBookid(),book);
            return true;
        }
        // �޸�ʧ��
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
