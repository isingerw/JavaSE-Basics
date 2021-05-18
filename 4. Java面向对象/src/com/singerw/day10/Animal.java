package com.singerw.day10;

/**
 * @ClassName: Animal
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author 张欣
 * @Date 2021-05-18 10:08
 */
public class Animal {
    private String color;
    private String type;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public void eat(String food) {
        System.out.println("在吃" + food);
    }
}

class Snake extends Animal {
}

class Monkey extends Animal {
    @Override
    public void eat(String food) {
        System.out.println("吃一口：" + food + "丢一口");
    }

//    public void play(String food) {
//        System.out.println("在吃：" + food);
//    }
}

class Coder extends Monkey {

}





