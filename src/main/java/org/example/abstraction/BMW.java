package org.example.abstraction;

public abstract class BMW {

    void commonFun(){

        System.out.println("inside common function");
    }

    abstract void accelerate();

    //can we create main method in abstract class ? -- yes

    public static void main(String[] args) {

        System.out.println("inside main function");
    }
}
