package org.example.staticmembers;

public class HelloWorld {


    public static void main(String[] args) {

        System.out.println("main method");

    }


    // static blocks excutes first then main method will excuted by jvm
    static {
        System.out.println("static block one");
    }


    static {
        System.out.println("static block two");
    }
}
