package com.singerw.demogen;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: TestGoods
 * @Description: //TODO ������
 * @Author: CodeSleep
 * @Date: 2021-06-01 9:49
 * @Version: 1.0
 */
public class TestGoods {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        // ��ž�����Ʒ
        List list = new ArrayList();
        Goods g = new Goods();
        //? һԪӲ��
        list.add(g);

        /// �﷨
        //һ����Ϸ��
        list.add("����");

        //<һ������ ��������>
        List<Goods> list1 = new ArrayList<Goods>();

        Goods g1 = new Goods();
        //? һԪӲ��

        list1.add(g);
        /// �﷨ ->����ʱ���� ->���ͼ�����.��Ž�ȥ->Goods,������Goods
        //he method add(Goods) in the type List<Goods>
        //is not applicable for the arguments (String)
        //list1.add("����"); //һ����Ϸ��


    }

}
