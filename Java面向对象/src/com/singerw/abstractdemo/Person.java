package com.singerw.abstractdemo;

/**
 * abstract class ������ �����಻��ֱ�ӱ�ʵ����
 *
 * @author Administrator
 */
public abstract class Person {
    // ����
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // ����
    public Person() {
        // TODO Auto-generated constructor stub
    }


    public Person(String name) {
        super();
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + "]";
    }

    //û�з�����ķ�����Ϊ���󷽷�
    public abstract String show();

}
