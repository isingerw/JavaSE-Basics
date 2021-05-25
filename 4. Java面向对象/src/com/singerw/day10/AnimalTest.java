package com.singerw.day10;

/**
 * @ClassName: AnimalTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @Author 张欣
 * @Date 2021-05-18 10:16
 */

public class AnimalTest {
    public static void main(String[] args) {
        Snake snake = new Snake();
        snake.setColor("白色");
        snake.setType("爬行类");

        Monkey monkey = new Monkey();
        monkey.setColor("金色");
        monkey.setType("灵长类");
        monkey.eat("蟠桃");

        Coder coder = new Coder();
        coder.setColor("XXX");
        coder.setType("XXX");

        System.out.println(snake);
        System.out.println(monkey);
        System.out.println(coder);

        // 子类引用 = 子类对象
        Monkey monkey1 = new Monkey();
        monkey.eat("仙桃");
        // 父类引用 = 父类对象
        Animal animal = new Animal();
        animal.eat("食物");
        // 父类引用 = 子类对象
        Animal ani = new Monkey();
        ani.eat("鲜桃");
        // 子类引用 = 父类对象
        Monkey mon = (Monkey) new Animal();
        mon.eat("桃儿");
    }

}
