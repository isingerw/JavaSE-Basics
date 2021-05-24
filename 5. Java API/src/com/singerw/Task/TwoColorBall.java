package com.singerw.Task;

public class TwoColorBall {
    /**
     * ˫ɫ��ÿעͶע������6����ɫ������1����ɫ�������ɡ�
     * ��ɫ������1--33��ѡ��
     * ��ɫ������1--16��ѡ��
     * ע��Ҫѡ��6����ɫ����룬1����ɫ����롣
     *
     * @param color
     * @param quantity
     * @param scope
     */
    public void randomGeneration(String color, int quantity, int scope) {
        //���ص���ĺ���
        int[] ballNumber = new int[quantity];
        for (int i = 0; i < ballNumber.length; i++) {
            int number = (int) (Math.random() * scope + 1);
            for (int j = 0; j < i; j++) {
                if (number == ballNumber[j]) {
                    number = (int) (Math.random() * scope + 1);
                    j = 0;
                }
            }
            ballNumber[i] = number;
        }
        System.out.print(color + "��������Ϊ��");
        for (int i = 0; i < ballNumber.length; i++) {
            System.out.print("\t" + ballNumber[i]);
        }
    }
}
