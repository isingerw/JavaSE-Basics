package com.singerw.arrays.student_comparable;

/**
 * @ClassName: Student
 * @Description: //TODO ������
 * @Author: CodeSleep
 * @Date: 2021-05-31 15:21
 * @Version: 1.0
 */
public class Student implements Comparable<Student> {

    @Override
    public int compareTo(Student o){
        return this.age - o.age;
    }

    private int id;
    private String name;
    private int age;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
    }

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
