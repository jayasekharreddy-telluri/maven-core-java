package org.example.inheritance;

public class OverridingTest {

    public static void main(String[] args) {

        Bus obj = new Bus();

        System.out.println(obj.fuel());

        Car obj2 = new Car();

        System.out.println(obj2.fuel());

    }
}
