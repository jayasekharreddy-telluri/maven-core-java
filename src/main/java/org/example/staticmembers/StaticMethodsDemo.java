package org.example.staticmembers;

public class StaticMethodsDemo {

    public static void main(String[] args) {


        System.out.println("main method");

        StaticMethodsDemo.methodOne();


    }

    static {
        System.out.println("static block one");
    }

    static void methodOne(){
        System.out.println("method one");
    }
}
