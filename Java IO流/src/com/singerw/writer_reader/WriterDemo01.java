package com.singerw.writer_reader;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @ClassName: WriterDemo01
 * @Description: //TODO 类描述
 * @Author: CodeSleep
 * @Date: 2021-06-03 9:09
 * @Version: 1.0
 */
public class WriterDemo01 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name adn age :");
        String name = input.next();
        int age = input.nextInt();
        input.close();

        FileWriter fw = new FileWriter("I:\\IDEA2019_Project\\JavaSE基础\\Java IO流\\src\\resources\\docs\\singer.txt",true);

        // 写入
        fw.write(name+"\t\n");
        fw.write(age+" ");
        fw.close();
        System.out.println("写入成功！");
    }
}
