package com.singerw.myexception;
/**
 * @ClassName: MyExceptionDemo
 * @Description: //TODO ������
 * @Author: CodeSleep
 * @Date: 2021-06-01 16:15
 * @Version: 1.0
 */
public class MyExceptionDemo {
    public static void main(String[] args) {
        throw new MyException("�Զ����쳣");
    }

    static class MyException extends RuntimeException{
        public MyException(String message){
            super(message);
        }
    }
}
