package org.example.nonstaticmembres;

public class ObjectRefDemo {

    int x;
    ObjectRefDemo(){

    }

    public static void main(String[] args) {

        ObjectRefDemo ob = new ObjectRefDemo();

        System.out.println(ob.x);
    }

}
