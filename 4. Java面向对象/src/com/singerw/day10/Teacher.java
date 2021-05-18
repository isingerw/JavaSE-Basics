package com.singerw.day10;

/**
 * @ClassName: Teacher
 * @Description: 教师父类
 * @Author 张欣
 * @Date 2021-05-18 10:44
 */
public class Teacher {
    private String name;

    public void teach() {
        System.out.println(name + "正在上课");
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * (这里用一句话描述这个构造函数的作用)
     */
    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }
}


class JavaTeacher extends Teacher {
    @Override
    public void teach() {
        super.teach();
        // 要有自己的一些方法内容
        System.out.println("打开Eplices，写一段Java代码");
    }
}

class CsharpTeacher extends Teacher {
    @Override
    public void teach() {
        super.teach();
        System.out.println("打开VS，写一段C#代码");
    }
}



