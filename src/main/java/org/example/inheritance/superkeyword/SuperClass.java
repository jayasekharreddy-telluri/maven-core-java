package org.example.inheritance.superkeyword;

public class SuperClass {

    int a ;
    public SuperClass(){

        System.out.println("no arg");
    }

    public SuperClass(int a){
        this();
        this.a = a;
        System.out.println(" arg cons : "+ a);
    }
}
