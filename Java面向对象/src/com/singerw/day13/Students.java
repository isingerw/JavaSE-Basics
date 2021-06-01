package com.singerw.day13;

public class Students {
    // 1 属性私有化
    private int id;
    private String name;

    // 2 提供公共的方法访问私有的属性
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Students{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}
