package com.singerw.day13;

public class Students {
    // 1 ����˽�л�
    private int id;
    private String name;

    // 2 �ṩ�����ķ�������˽�е�����
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
