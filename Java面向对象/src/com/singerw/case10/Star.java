package com.singerw.case10;

/**
 * 1 创建父类，父类定义一个统一 的方法
 * public void show(String sm)
 *
 * @author Administrator
 */
public class Star {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(String sm) {
        System.out.println("表演开始:");
    }
}
