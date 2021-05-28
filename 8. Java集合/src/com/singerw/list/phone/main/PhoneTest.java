package com.singerw.list.phone.main;

import com.singerw.list.phone.dao.PhoneDao;
import com.singerw.list.phone.pojo.Phonepojo;

import java.util.ArrayList;

/**
 * @ClassName: PhoneTest
 * @Description: TODO Phone测试类
 * @Author 张欣
 * @Date 2021-05-27 20:53
 */
public class PhoneTest {
    public static void main(String[] args) {
        // 实例化PhoneDao对象
        PhoneDao phoneDao = new PhoneDao();
        ArrayList<Phonepojo> list = new ArrayList();
        // 编号 价格 型号 品牌
        //String id, String prive, String model, String brand
        Phonepojo huawei = new Phonepojo("01", "2999", "保时捷", "华为");
        Phonepojo iphone = new Phonepojo("02", "6800", "iPhone12", "iPhone");
        Phonepojo xiaomi = new Phonepojo("03", "2999", "小米11", "小米");
        Phonepojo oppop = new Phonepojo("04", "2999", "R15", "Oppop");

        // 调用add()方法
        // 将 huawei iphone xiaomi oppop添加到集合中
        System.out.println("———————————————————————————添加后———————————————————————————");
        phoneDao.add(huawei);
        phoneDao.add(iphone);
        phoneDao.add(xiaomi);
        phoneDao.add(oppop);
        // 输出集合
        list = phoneDao.getPhoneList();
        if (list.isEmpty()) {
            System.out.println("集合中无数据");
        } else {
            list.forEach(System.out::println);
        }

        // 调用getPhoneList()方法 查询集合中的数据
        System.out.println("———————————————————————————查询方法———————————————————————————");
        System.out.println(phoneDao.getPhoneById("01"));
        System.out.println(phoneDao.getPhoneById("02"));
        System.out.println(phoneDao.getPhoneById("08"));


        System.out.println("———————————————————————————删除前———————————————————————————");
        // 删除前输出集合
        list = phoneDao.getPhoneList();
        if (list.isEmpty()) {
            System.out.println("集合中无数据");
        } else {
            list.forEach(System.out::println);
        }

        // 调用deletePhoneById()方法，删除集合中的元素
        System.out.println("———————————————————————————删除后———————————————————————————");
        phoneDao.deletePhoneById("03");
        // 删除后输出集合
        list = phoneDao.getPhoneList();
        if (list.isEmpty()) {
            System.out.println("集合中无数据");
        } else {
            list.forEach(System.out::println);
        }
    }
}
