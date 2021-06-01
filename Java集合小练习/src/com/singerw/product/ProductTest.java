package com.singerw.product;


import java.util.ArrayList;

class ProductTest {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        ArrayList<Product> list = productDao.getProduct();

        // ����һ��product����
        Product p1 = new Product("123456","èè",230.5);
        Product p2 = new Product("456789","����",890.5);
        Product p3 = new Product("789101","����",123.56);


        // ��p1��p2��ӵ�������
        System.out.println("**************************��Ӻ�**************************");
        productDao.add(p1);
        productDao.add(p2);
        productDao.add(p3);

        // ���
        list = productDao.getProduct();
        if (list.isEmpty()){
            System.out.println("����������");
        }else{
            list.forEach(System.out::println);
        }


        System.out.println("**************************��ѯ����**************************");
        // ���ò�ѯ����
        System.out.println(productDao.getProductById("123456"));
        System.out.println(productDao.getProductById("123"));


        System.out.println("**************************ɾ��ǰ**************************");
        // �����ĵ��ã���Ҫʲô�������ṩʲô����
        // ���
        list = productDao.getProduct();
        if (list.isEmpty()){
            System.out.println("����������");
        }else{
            list.forEach(System.out::println);
        }


        System.out.println("**************************ɾ����**************************");
        // ɾ��
        productDao.delectProductById("789101");
        // ���
        list = productDao.getProduct();
        if (list.isEmpty()){
            System.out.println("����������");
        }else{
            list.forEach(System.out::println);
        }

    }

}