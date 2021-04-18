package com.jy.test;

public class B extends C{
    private String name;
    int age;

    public B(String name, int age) {
        super("C클래스");
        System.out.println("---------B---------");

        this.name = name;
        this.age = age;

        System.out.println("내 이름은 " + name + " 입니다.");
        System.out.println("내 나이는 " + age + " 입니다.");
        A aa = new A(this.name);
        System.out.println("---------B---------");
    }



    A a = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public A injection() {
        return a = new A(name);
    }
}
