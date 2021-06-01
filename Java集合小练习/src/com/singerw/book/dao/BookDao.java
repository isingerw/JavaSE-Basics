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
        list.add(book);
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
        for (int i = 0; i < list.size(); i++) {
            // ���������Ѵ��ڵ�Ԫ�أ���ʱ������ֵ��find
            BookEntity find = list.get(i);
            if (id.equals(find.getBookid())) {
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
     * @param id
     * @return
     * @Author: CodeSleep
     * @Date: 2021-05-29 22:55
     * @Description: //TODO ����Ԫ�ز����ز��ҽ��
     */
    public BookEntity getBookById(String id) {
        for (int i = 0; i < list.size(); i++) {
            // ���������Ѵ��ڵ�Ԫ�أ���ֵ����ʱ����find
            BookEntity find = list.get(i);
            if (id.equals(find.getBookid())) {
                // ����ҵ������Ԫ�ط������Ԫ�أ����������
                return find;
            }
        }
        // ���û���ҵ����Ԫ���򷵻�null,���������
        return null;
    }

    /**
     * @Author: CodeSleep
     * @Date: 2021-05-31 9:27
     * @Description: //TODO ���Ҳ��޸ļ����е�Ԫ��
     * @param book
     * @return
     */
    public boolean updateBook(BookEntity book) {
        // ����id��ѯ�Ƿ�������p����
        for (int i = 0; i < list.size(); i++) {
            // �����е�Ԫ�� ��ֵ����ʱ���� find
            BookEntity find = list.get(i);
            if (book.getBookid().equals(find.getBookid())) {
                //���µ� p���� �� pfind���滻��
                list.set(i, book);
                // ���ִ�е���return ��ô��������
                return true;
            }
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
    public ArrayList<BookEntity> getBookList() {
        return list;
    }
}
