package com.singerw.list.phone.main;

import com.singerw.list.phone.dao.PhoneDao;
import com.singerw.list.phone.pojo.Phonepojo;

import java.util.ArrayList;

/**
 * @ClassName: PhoneTest
 * @Description: TODO Phone������
 * @Author ����
 * @Date 2021-05-27 20:53
 */
public class PhoneTest {
    public static void main(String[] args) {
        // ʵ����PhoneDao����
        PhoneDao phoneDao = new PhoneDao();
        ArrayList<Phonepojo> list = new ArrayList();
        // ��� �۸� �ͺ� Ʒ��
        //String id, String prive, String model, String brand
        Phonepojo huawei = new Phonepojo("01", "2999", "��ʱ��", "��Ϊ");
        Phonepojo iphone = new Phonepojo("02", "6800", "iPhone12", "iPhone");
        Phonepojo xiaomi = new Phonepojo("03", "2999", "С��11", "С��");
        Phonepojo oppop = new Phonepojo("04", "2999", "R15", "Oppop");

        // ����add()����
        // �� huawei iphone xiaomi oppop��ӵ�������
        System.out.println("��������������������������������������������������������Ӻ󡪡���������������������������������������������������");
        phoneDao.add(huawei);
        phoneDao.add(iphone);
        phoneDao.add(xiaomi);
        phoneDao.add(oppop);
        // �������
        list = phoneDao.getPhoneList();
        if (list.isEmpty()) {
            System.out.println("������������");
        } else {
            list.forEach(System.out::println);
        }

        // ����getPhoneList()���� ��ѯ�����е�����
        System.out.println("��������������������������������������������������������ѯ����������������������������������������������������������");
        System.out.println(phoneDao.getPhoneById("01"));
        System.out.println(phoneDao.getPhoneById("02"));
        System.out.println(phoneDao.getPhoneById("08"));


        System.out.println("������������������������������������������������������ɾ��ǰ������������������������������������������������������");
        // ɾ��ǰ�������
        list = phoneDao.getPhoneList();
        if (list.isEmpty()) {
            System.out.println("������������");
        } else {
            list.forEach(System.out::println);
        }

        // ����deletePhoneById()������ɾ�������е�Ԫ��
        System.out.println("������������������������������������������������������ɾ���󡪡���������������������������������������������������");
        phoneDao.deletePhoneById("03");
        // ɾ�����������
        list = phoneDao.getPhoneList();
        if (list.isEmpty()) {
            System.out.println("������������");
        } else {
            list.forEach(System.out::println);
        }
    }
}
