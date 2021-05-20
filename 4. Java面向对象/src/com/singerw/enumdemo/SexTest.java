package com.singerw.enumdemo;


public class SexTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.esex = EnumSex.ÄÐ;
        System.out.println(person.sex);
        System.out.println(person.esex);

        switch (person.esex){
            case ÄÐ:
                System.out.println("ÄÐ");
                break;
            case Å®:
                System.out.println("Å®");
                break;
            default:
                System.out.println("±£ÃÜ");
        }
    }
}
class Person{
    String sex;
    EnumSex esex;
}