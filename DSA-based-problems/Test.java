package com.gfg;

public class Test {
    public static void main(String[] args) {
        Child2 c1 = new Child2();
    }
}
class Child2 extends Child{
    Child2(){
        System.out.println("Child2");
    }
}


class Child extends Parent{
    Child(){
        System.out.println("Child");
    }
}

class Parent{
    Parent(){
        System.out.println("Parent");
    }
}
