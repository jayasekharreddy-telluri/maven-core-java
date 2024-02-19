package org.example.inheritance.superkeyword;

public class Test {

    public static void main(String[] args) {

        Child c = new Child(22,222,2222,22222);


        Child c2 = new Child(33,333,3333,33333);

        c.details();

        c2.details();

        c.m1();

    }
}
