package com.singerw.Task;

/**
 * @ClassName: Students
 * @Description: TODO(������һ�仰��������������)
 * @Author ����
 * @Date 2021-05-21 16:40
 */
public class Students {
    public static void main(String[] args) {

    }
    private int ID;
    private String name;
    private int age;
    private String birthdate;

    public Students() {
    }

    public Students(int ID, String name, int age, String birthdate) {
        super();
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Students{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthdate='" + birthdate + '\'' +
                '}';
    }
}
