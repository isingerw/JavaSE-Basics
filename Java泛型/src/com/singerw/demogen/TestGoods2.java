package com.singerw.demogen;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: TestGoods2
 * @Description: //TODO 类描述
 * @Author: CodeSleep
 * @Date: 2021-06-01 9:49
 * @Version: 1.0
 */
public class TestGoods2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // 存放就是商品
        List list = new ArrayList();
        Goods g = new Goods();
        // ? 一元硬币
        list.add(g);

        // 如果没有使用泛型，我们存进去之后就是Object
        // 当我们取出来的时候，也是object,没办法直接使用
        for (Object object : list) {
            // ???
            Goods obj = (Goods) object;
            System.out.println(obj.getId());
        }

        System.out.println("********************");
        // <一个类型 引用类型>
        List<Goods> list1 = new ArrayList<Goods>();

        Goods g1 = new Goods();
        // ? 一元硬币
        list1.add(g);

        for (Goods goods : list1) {
            System.out.println(goods.getId());
        }

    }

}
