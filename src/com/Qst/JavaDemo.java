package com.Qst;
class Person {
    private String name ;
    private int age ;
    public Person(String name, int age ) {
        this.name = name ;
        this.age = age ;
    }
    public void  tell() {
        System.out.println("姓名：" + this.name + "，年龄：" + this.age);
    }
}
public class JavaDemo {   //主类
    public static void main(String[] args) {
        Person per = new Person("王五",12) ;
        per.tell();
    }
}
