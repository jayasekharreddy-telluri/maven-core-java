package org.example.wrapperclasses;

public class PrimitiveAndObject {


    //wrapper classes are used to represent primitive types as object types

    public static void main(String[] args) {

        int a = 20;

        Integer aa = Integer.valueOf(a);// boxing

        int z = aa.intValue();//unboxing


    }

}
