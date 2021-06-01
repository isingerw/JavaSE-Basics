package com.singerw;
/**
 * @ClassName: TestAssert
 * @Description: //TODO 类描述
 * @Author: CodeSleep
 * @Date: 2021-06-01 17:08
 * @Version: 1.0
 */
public class TestAssert {
    public static void main(String[] args) {
        String str = " ";
        // 条件为false时，显示assert，程序中段
        // assert 要开启后才能使用
        assert str.length() != 0:"assert信息";
    }
}
