package com.singerw.day07;

/**
 * @ClassName: OOP_Class_04
 * @Description: TODO(创建类 ， 定义方法完成判断某个数是否是质数判断)
 * @Author 张欣
 * @Date 2021-05-14 15:22
 */
public class OOP_Class_04 {
    /**
     * (有参数，无返回值)
     *
     * @param n
     */
    public void number1(int n) {
        // 质数判断
        boolean flag = true;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % 2 == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(n + "是质数");
        }else {
            System.out.println(n + "不是质数");
        }
    }

    /**
     * (无参数，有返回值)
     * @param
     * @return
     */
    public boolean number2(int n) {
        // 质数判断
        boolean flag = true;
        for (int i = 2; i < Math.sqrt(n); i++) {
            if (n % 2 == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

}
