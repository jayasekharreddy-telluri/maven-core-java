package org.example.wrapperclasses;

public class StringAndObject {

    public static void main(String[] args) {

        long l = 12;

        Long f = Long.valueOf(l);

        String s = f.toString();

        long k = Long.parseLong(s);




    }
}
