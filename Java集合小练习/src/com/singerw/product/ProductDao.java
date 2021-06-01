package com.singerw.product;

import java.util.ArrayList;

/**
 * @ClassName: ProductDao
 * @Description: ���ݷ��ʶ���
 * @Author ����
 * @Date 2021-05-27 14:58
 */
public class ProductDao {
    /**
     * ����������Product
     */
    private ArrayList<Product> list = new ArrayList();


    // Product

    /**
     * �򼯺������Ԫ��
     *
     * @param product
     * @return
     */
    public boolean add(Product product) {
        // ���������ж�
        if (product == null) {
            return false;
        }
        list.add(product);
        return true;
    }

    /**
     * ����id����ָ����product
     *
     * @param id String id
     * @return Product�������null����û���ҵ�
     */
    public Product getProductById(String id) {
        for (int i = 0; i < list.size(); i++) {
            // �����е�Ԫ�أ���ֵ����ʱ����pfind
            Product pfind = list.get(i);
            if (id.equals(pfind.getId())) {
                // ���ִ�е���return,��ô��������
                return pfind;
            }
        }
        return null;
    }

    /**
     * ����idɾ��product����
     *
     * @param id
     * @return trun �ɹ�   false ʧ��
     */
    public boolean delectProductById(String id) {
        for (int i = 0; i < list.size(); i++) {
            // �����е�Ԫ�أ���ֵ����ʱ����pfind
            Product pfind = list.get(i);
            if (id.equals(pfind.getId())) {
                list.remove(i);
                // ���ִ�е���return,��ô��������
                return true;
            }
        }
        return false;
    }


    public void updateProduct() {

    }

    /**
     * ���ؼ��ϵ���������
     *
     * @return list
     */
    public ArrayList<Product> getProduct() {
        return list;
    }

}

