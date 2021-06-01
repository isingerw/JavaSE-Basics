package com.singerw.day08;

/**
 * @ClassName: OOP_Class_04
 * 创建类，定义方法完成判断某个是是否是质数
 * 有参数，无返回值
 * 有参数，有返回值
 * 使用Debug完成程序的调试
 * @Author 张欣
 * @Date 2021-05-20 0:26
 */
public class OOP_Class_04 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        ZhiShu zhiShu = new ZhiShu();
        int n = 123;
        zhiShu.judge1(n);
        boolean flag = zhiShu.judge2(n);
        if (flag) {
            System.out.println(n + "是质数");
        } else {
            System.out.println(n + "不是质数");
        }
    }

}
