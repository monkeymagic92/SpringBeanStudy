package com.jy.test;

public class A {

    public A(String name) {
        System.out.println("--------------A-------------");
        System.out.println("저의 이름은 " + name + " 입니다.");
        talk();
        System.out.println("--------------A-------------");
    }

    public void talk() {
        System.out.println("A생성자 종료합니다~");
    }
}
