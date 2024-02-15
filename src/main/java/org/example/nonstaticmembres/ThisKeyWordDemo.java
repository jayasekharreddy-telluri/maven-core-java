package org.example.nonstaticmembres;

public class ThisKeyWordDemo {

    int x;

    ThisKeyWordDemo(){
        //this keyword useful to refer a object references
        System.out.println(this);

        System.out.println(this.x);
    }

    public static void main(String[] args) {

        new ThisKeyWordDemo();

        new ThisKeyWordDemo();

    }
}
