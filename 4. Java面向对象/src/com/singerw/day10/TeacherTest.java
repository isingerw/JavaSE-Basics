package com.singerw.day10;
/**
* @ClassName: TeacherTest
* @Description: TODO(这里用一句话描述这个类的作用)
* @Author 张欣
* @Date 2021-05-18 11:28
*/
public class TeacherTest {

    public static void main(String[] args) {
        JavaTeacher javaTeacher = new JavaTeacher();
        javaTeacher.setName("大杨老师");
        javaTeacher.teach();

        CsharpTeacher csharpTeacher = new CsharpTeacher();
        csharpTeacher.setName("许戈静老师");
        csharpTeacher.teach();
    }
}
