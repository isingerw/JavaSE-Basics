package com.singerw.day08;

/**
 * 创建类，定义方法完成判断某个是是否是质数
 * 有参数，无返回值
 * 有参数，有返回值
 * 使用`Debug`完成程序的调试
 *
 * @Author 张欣
 * @Date 2021-05-20 0:34
 */
public class ZhiShu {
    /**
     * @param n
     */
    public void judge1(int n) {
        // 判断n是否是质数，输出结果
        boolean flag = true;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(n + "是质数");
        } else {
            System.out.println(n + "不是质数");
        }
    }

    /**
     * @param n
     * @return
     */
    public boolean judge2(int n) {
        // 判断n是否是质数，输出结果
        boolean flag = true;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
