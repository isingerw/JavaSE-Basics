package com.singerw.list.phone.dao;

import com.singerw.list.phone.pojo.Phonepojo;

import java.util.ArrayList;

/**
 * @ClassName: PhoneDao
 * @Description: TODO(���ݷ�������� �� ʵ��phone����ɾ���)
 * @Author ����
 * @Date 2021-05-27 20:59
 */
public class PhoneDao {


    private final ArrayList<Phonepojo> list = new ArrayList<Phonepojo>();


    // Phone

    /**
     * @Author CodeSleep
     * @Description //TODO(�򼯺������Ԫ��)
     * @Date 2021-05-29 0:57
     * @param phone
     * @return
     */
    public boolean add(Phonepojo phone) {
        // �����ж�
        if (phone == null) {
            return false;
        }
        list.add(phone);
        return true;
    }

    /**
     * ���Ҽ����е�Ԫ�ؽ���ɾ������
     *
     * @param id
     * @return
     */
    public boolean deletePhoneById(String id) {
        for (int i = 0; i < list.size(); i++) {
            // �����е�Ԫ�أ���ֵ����ʱ����pfind
            Phonepojo find = list.get(i);
            if (id.equals(find.getId())) {
                list.remove(i);
                // ���ִ�е���return����ô��������
                return true;
            }
        }
        return false;
    }

    /**
     * ����id���Ҽ����е�Ԫ��
     *
     * @param id
     * @return
     */
    public Phonepojo getPhoneById(String id) {
        for (int i = 0; i < list.size(); i++) {
            // �����е�Ԫ�ظ�ֵ����ʱ����find
            Phonepojo find = list.get(i);
            if (id.equals(find.getId())) {
                return find;
            }
        }
        return null;
    }

    /**
     * �Լ����е�Ԫ�ؽ����޸Ĳ���
     *
     * @param id
     * @return
     */
    public boolean updatePhoneById(String id) {
        return true;
    }


    /**
     * ���ؼ����е������б�/����
     *
     * @return
     */
    public ArrayList<Phonepojo> getPhoneList() {
        return list;
    }


}
