package org.example.inheritance.superkeyword;

public class Child extends Parent {

    int c;

    int d;
    Child(int a, int b,int c,int d) {
        super(a, b);

        this.c = c;

        this.d = d;
    }


    void details(){
        System.out.println("parent a :"+ a);
        System.out.println("parent b :"+ b);
        System.out.println("parent c :"+ c);
        System.out.println("parent d :"+ d);


    }

    void m1(){

        super.m1();

        System.out.println(" child ");
    }

}
