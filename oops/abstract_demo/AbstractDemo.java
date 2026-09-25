package oops.abstract_demo;

public class AbstractDemo {
    public static void main(String[] args) {
        // A a = new A(); - con't create object
        B b = new B();
        System.out.println(b.x);
    }
}

abstract class A{
    int x = 10;
}

class B extends  A{
    
}