package com.singerw.login_game.game;

import java.util.Scanner;

public class GuessNumberGame {
    private GuessNumberGame() {

    }

    public static void start() {
        int count = 0;

        // ����1-100֮��������

        int number = (int) (Math.random() * 10) + 1;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("��������Ҫ�µ�1-10�����֣�");

            // ��ȡ���������
            int guessNumber = input.nextInt();
            count++;

            if (guessNumber < number) {
                System.out.println("��µ�����С��");
            } else if (guessNumber > number) {
                System.out.println("��µ����ִ���");
            } else {
                System.out.println("��¶���");
            }
            break;
        }
    }
}
