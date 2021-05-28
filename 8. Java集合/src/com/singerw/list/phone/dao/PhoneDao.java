package com.singerw.list.phone.dao;

import com.singerw.list.phone.pojo.Phonepojo;

import java.util.ArrayList;

/**
 * @ClassName: PhoneDao
 * @Description: TODO(数据访问你对象 ， 实现phone的增删查改)
 * @Author 张欣
 * @Date 2021-05-27 20:59
 */
public class PhoneDao {


    private final ArrayList<Phonepojo> list = new ArrayList<Phonepojo>();


    // Phone

    /**
     * @Author CodeSleep
     * @Description //TODO(向集合中添加元素)
     * @Date 2021-05-29 0:57
     * @param phone
     * @return
     */
    public boolean add(Phonepojo phone) {
        // 条件判断
        if (phone == null) {
            return false;
        }
        list.add(phone);
        return true;
    }

    /**
     * 查找集合中的元素进行删除操作
     *
     * @param id
     * @return
     */
    public boolean deletePhoneById(String id) {
        for (int i = 0; i < list.size(); i++) {
            // 集合中的元素，赋值给临时变量pfind
            Phonepojo find = list.get(i);
            if (id.equals(find.getId())) {
                list.remove(i);
                // 如果执行到了return，那么方法结束
                return true;
            }
        }
        return false;
    }

    /**
     * 根据id查找集合中的元素
     *
     * @param id
     * @return
     */
    public Phonepojo getPhoneById(String id) {
        for (int i = 0; i < list.size(); i++) {
            // 集合中的元素赋值给临时变量find
            Phonepojo find = list.get(i);
            if (id.equals(find.getId())) {
                return find;
            }
        }
        return null;
    }

    /**
     * 对集合中的元素进行修改操作
     *
     * @param id
     * @return
     */
    public boolean updatePhoneById(String id) {
        return true;
    }


    /**
     * 返回集合中的所有列表/类型
     *
     * @return
     */
    public ArrayList<Phonepojo> getPhoneList() {
        return list;
    }


}
