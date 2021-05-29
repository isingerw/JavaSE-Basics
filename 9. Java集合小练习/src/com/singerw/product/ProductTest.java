package com.singerw.product;


import java.util.ArrayList;

class ProductTest {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        ArrayList<Product> list = productDao.getProduct();

        // 创建一个product对象
        Product p1 = new Product("123456","猫猫",230.5);
        Product p2 = new Product("456789","狗狗",890.5);
        Product p3 = new Product("789101","猪猪",123.56);


        // 将p1和p2添加到集合中
        System.out.println("**************************添加后**************************");
        productDao.add(p1);
        productDao.add(p2);
        productDao.add(p3);

        // 输出
        list = productDao.getProduct();
        if (list.isEmpty()){
            System.out.println("集合无数据");
        }else{
            list.forEach(System.out::println);
        }


        System.out.println("**************************查询方法**************************");
        // 调用查询方法
        System.out.println(productDao.getProductById("123456"));
        System.out.println(productDao.getProductById("123"));


        System.out.println("**************************删除前**************************");
        // 方法的调用，需要什么参数就提供什么参数
        // 输出
        list = productDao.getProduct();
        if (list.isEmpty()){
            System.out.println("集合无数据");
        }else{
            list.forEach(System.out::println);
        }


        System.out.println("**************************删除后**************************");
        // 删除
        productDao.delectProductById("789101");
        // 输出
        list = productDao.getProduct();
        if (list.isEmpty()){
            System.out.println("集合无数据");
        }else{
            list.forEach(System.out::println);
        }

    }

}