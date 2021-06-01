package com.singerw.product;

import java.util.ArrayList;

/**
 * @ClassName: ProductDao
 * @Description: 数据访问对象
 * @Author 张欣
 * @Date 2021-05-27 14:58
 */
public class ProductDao {
    /**
     * 集合来保存Product
     */
    private ArrayList<Product> list = new ArrayList();


    // Product

    /**
     * 向集合中添加元素
     *
     * @param product
     * @return
     */
    public boolean add(Product product) {
        // 各种条件判断
        if (product == null) {
            return false;
        }
        list.add(product);
        return true;
    }

    /**
     * 根据id查找指定的product
     *
     * @param id String id
     * @return Product对象，如果null，则没有找到
     */
    public Product getProductById(String id) {
        for (int i = 0; i < list.size(); i++) {
            // 集合中的元素，赋值给临时变量pfind
            Product pfind = list.get(i);
            if (id.equals(pfind.getId())) {
                // 如果执行到了return,那么方法结束
                return pfind;
            }
        }
        return null;
    }

    /**
     * 根据id删除product对象
     *
     * @param id
     * @return trun 成功   false 失败
     */
    public boolean delectProductById(String id) {
        for (int i = 0; i < list.size(); i++) {
            // 集合中的元素，赋值给临时变量pfind
            Product pfind = list.get(i);
            if (id.equals(pfind.getId())) {
                list.remove(i);
                // 如果执行到了return,那么方法结束
                return true;
            }
        }
        return false;
    }


    public void updateProduct() {

    }

    /**
     * 返回集合的所有类型
     *
     * @return list
     */
    public ArrayList<Product> getProduct() {
        return list;
    }

}

