package com.singerw.demogen;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: TestGoods2
 * @Description: //TODO ������
 * @Author: CodeSleep
 * @Date: 2021-06-01 9:49
 * @Version: 1.0
 */
public class TestGoods2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // ��ž�����Ʒ
        List list = new ArrayList();
        Goods g = new Goods();
        // ? һԪӲ��
        list.add(g);

        // ���û��ʹ�÷��ͣ����Ǵ��ȥ֮�����Object
        // ������ȡ������ʱ��Ҳ��object,û�취ֱ��ʹ��
        for (Object object : list) {
            // ???
            Goods obj = (Goods) object;
            System.out.println(obj.getId());
        }

        System.out.println("********************");
        // <һ������ ��������>
        List<Goods> list1 = new ArrayList<Goods>();

        Goods g1 = new Goods();
        // ? һԪӲ��
        list1.add(g);

        for (Goods goods : list1) {
            System.out.println(goods.getId());
        }

    }

}
