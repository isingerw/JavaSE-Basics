package com.singerw.book.dao;

import com.singerw.book.entity.BookEntity;

import java.util.ArrayList;

/**
 * @ClassName: BookDao
 * @Description: //TODO ��ѯ���޸ģ�ɾ�������Ӳ���(ArrayList���洢)
 * @Author: CodeSleep
 * @Date: 2021-05-29 22:16
 * @Version: 1.0
 */
public class BookDao {

    /**
     * ArrayList���洢
     */
    ArrayList<BookEntity> list = new ArrayList<>();


    // ���ӡ�ɾ�����޸ġ���ѯ����

    /**
     * @Author: CodeSleep
     * @Date: 2021-05-29 22:43
     * @Description: //TODO �����
     * @param book
     * @return
     */
    public boolean addBook(BookEntity book){
        //�����ж�
        if (book == null){
            return false;
        }
        list.add(book);
        return true;
    }

    /**
     * @Author: CodeSleep
     * @Date: 2021-05-29 22:49
     * @Description: //TODO ���Ҳ�ɾ����
     * @param id
     * @return
     */
    public boolean deleteBook(String id){
        for (int i = 0; i < list.size(); i++) {
            // ���������Ѵ��ڵ�Ԫ�أ���ʱ������ֵ��find
            BookEntity find = list.get(i);
            if (id.equals(find.getBookid())){
                // ����ҵ���ɾ�����Ԫ��
                list.remove(i);
                // ɾ����ִ�е�return�����������
                return true;
            }
        }
        // ���û�ҵ�Ҳû����ɾ���������򷵻�false,���������
        return false;
    }

    /**
     * @Author: CodeSleep
     * @Date: 2021-05-29 22:55
     * @Description: //TODO ����Ԫ�ز����ز��ҽ��
     * @param id
     * @return
     */
    public BookEntity getBookById(String id){
        for (int i = 0; i < list.size(); i++) {
            // ���������Ѵ��ڵ�Ԫ�أ���ֵ����ʱ����find
            BookEntity find = list.get(i);
            if (id.equals(find.getBookid())){
                // ����ҵ������Ԫ�ط������Ԫ�أ����������
                return find;
            }
        }
        // ���û���ҵ����Ԫ���򷵻�null,���������
        return null;
    }

    /**
     * @Author: CodeSleep
     * @Date: 2021-05-29 23:04
     * @Description: //TODO ���Ҳ��޸ļ����е�Ԫ��
     * @param id
     * @return
     */
    public BookEntity updateBookById(String id){
        for (int i = 0; i < list.size(); i++) {
            // ��������Ѵ��ڵ�Ԫ�أ���ֵ����ʱ����find
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
     * @Description: //TODO ���ؼ��������е�Ԫ��
     * @return list
     */
    public ArrayList<BookEntity> getBookList(){
        return list;
    }
}
