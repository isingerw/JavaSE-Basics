package com.singerw.writer_reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @ClassName: BufferedReaderDemo
 * @Description: //TODO ������
 * @Author: CodeSleep
 * @Date: 2021-06-03 9:37
 * @Version: 1.0
 */
public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("I:\\IDEA2019_Project\\JavaSE����\\Java IO��\\src\\resources\\docs\\singer.txt");
        BufferedReader br = new BufferedReader(reader);

        // һ�ζ�ȡһ��
        String str = null;
        // str = br.readLine ��ȡһ�в���ֵ��str����
        // str!=null �ж��Ƿ�Ϊnull;
        while ((str = br.readLine()) !=null){
            System.out.println(str);
        }
        // �ر���
        br.close();
        reader.close();
    }
}
