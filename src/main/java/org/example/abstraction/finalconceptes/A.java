package org.example.abstraction.finalconceptes;

public class A {

    int a = 2;

   // final int a = 2;

    final void display(){

    }

    public static void main(String[] args) {
        A aa =  new A();

        aa.a = 34;

        //aa.a = 23; error
    }

}
