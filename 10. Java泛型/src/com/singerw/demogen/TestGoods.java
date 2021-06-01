package com.singerw.demogen;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: TestGoods
 * @Description: //TODO 类描述
 * @Author: CodeSleep
 * @Date: 2021-06-01 9:49
 * @Version: 1.0
 */
public class TestGoods {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // 存放就是商品
        List list = new ArrayList();
        Goods g = new Goods();
        //? 一元硬币
        list.add(g);

        /// 语法
        //一个游戏币
        list.add("测试");

        //<一个类型 引用类型>
        List<Goods> list1 = new ArrayList<Goods>();

        Goods g1 = new Goods();
        //? 一元硬币

        list1.add(g);
        /// 语法 ->编译时出错 ->类型检测机制.存放进去->Goods,必须是Goods
        //he method add(Goods) in the type List<Goods>
        //is not applicable for the arguments (String)
        //list1.add("测试"); //一个游戏币


    }

}
