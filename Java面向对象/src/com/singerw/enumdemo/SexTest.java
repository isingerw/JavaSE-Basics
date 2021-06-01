package com.singerw.enumdemo;


public class SexTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.esex = EnumSex.��;
        System.out.println(person.sex);
        System.out.println(person.esex);

        switch (person.esex){
            case ��:
                System.out.println("��");
                break;
            case Ů:
                System.out.println("Ů");
                break;
            default:
                System.out.println("����");
        }
    }
}
class Person{
    String sex;
    EnumSex esex;
}