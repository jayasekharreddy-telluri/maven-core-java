package org.example.abstraction.interfaces;

public class Honda implements Car{


    @Override
    public void go() {
        System.out.println(" honda go");
    }

    @Override
    public void stop() {

        System.out.println(" honda stop");
    }
}
