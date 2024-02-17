package org.example.accessmodifiers;

public class A {

    private int a = 10;

    int b = 30;

    public int c = 40;

    protected int d = 20;

    public static void main(String[] args) {

        A obj = new A();
        System.out.println(obj.a);


        System.out.println(obj.b);

        System.out.println(obj.c);

        System.out.println(obj.d);

    }

}
