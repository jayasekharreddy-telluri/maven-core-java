package org.example.nonstaticmembres;

public class NonStaticDemo {

    int num;

    {

        System.out.println("inside non static block");

    }

    NonStaticDemo() {

        System.out.println("inside constructor");
    }

    public static void main(String[] args) {


        System.out.println("inside  main static block");

        new NonStaticDemo();
    }


}
