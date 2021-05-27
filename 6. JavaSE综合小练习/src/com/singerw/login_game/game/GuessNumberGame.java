package com.singerw.login_game.game;

import java.util.Scanner;

public class GuessNumberGame {
    private GuessNumberGame() {

    }

    public static void start() {
        int count = 0;

        // 产生1-100之间的随机数

        int number = (int) (Math.random() * 10) + 1;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("请输入你要猜的1-10的数字：");

            // 读取输入的数字
            int guessNumber = input.nextInt();
            count++;

            if (guessNumber < number) {
                System.out.println("你猜的数字小了");
            } else if (guessNumber > number) {
                System.out.println("你猜的数字大了");
            } else {
                System.out.println("你猜对了");
            }
            break;
        }
    }
}
