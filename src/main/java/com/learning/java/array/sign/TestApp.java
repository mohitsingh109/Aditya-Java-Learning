package com.learning.java.array.sign;

public class TestApp {

    public static void main(String[] args) {
        Sign sign = new Sign("ABC222DE", 3);
        System.out.println(sign.numberOfLines());
        System.out.println(sign.getLines());

        sign = new Sign("ABCD", 10);
        System.out.println(sign.numberOfLines());
        System.out.println(sign.getLines());

        sign = new Sign("", 4);
        System.out.println(sign.numberOfLines());
        System.out.println(sign.getLines());

        sign = new Sign("AB_CD_EF", 2);
        System.out.println(sign.numberOfLines());
        System.out.println(sign.getLines());

    }
}
