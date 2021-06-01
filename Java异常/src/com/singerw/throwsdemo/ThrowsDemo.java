package com.singerw.throwsdemo;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @ClassName: ThrowsDemo
 * @Description: //TODO ������
 * @Author: CodeSleep
 * @Date: 2021-06-01 16:22
 * @Version: 1.0
 */
public class ThrowsDemo {
    public static void main(String[] args) {
        f2();
    }

    public static void f1() throws NoSuchMethodException, NoSuchFieldException {
        Field field = Integer.class.getDeclaredField("digits");
        if (field != null) {
            System.out.println("�����ȡdigits�ɹ�");
        }
        Method method = String.class.getMethod("toString", int.class);
        if (method != null) {
            System.out.println("�����ȡtoString�ɹ�");
        }
    }

    public static void f2() {
        try {
            try {
                f1();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (NoSuchFieldException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
