package org.example.inheritance.superkeyword;

public class ChildClass extends SuperClass {

    public ChildClass(){
        this(22);
        System.out.println("no arg child");
    }


    public ChildClass(int x){
        super(7);
        System.out.println("arg child "+ x);
    }

    public static void main(String[] args) {

        ChildClass ob = new ChildClass();


    }
}
