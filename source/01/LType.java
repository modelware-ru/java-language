package ru.java;

import static java.lang.Math.*;

enum Size {
    SMALL,
    MEDIUM,
    LARGE,
    HUGE
}

public class LType {
//    public static void main(String[] args) {
//    public static void main(String\u005b\u005d args) {
    public static strictfp void main(String[] args) {
        byte b = 1;
//        byte b = 1L;
        short s = 1;
        int i1 = 1;
        int i2 = 0xAAAA;
        int i3 = 017;
//        int i3 = 08;
        int i4 = 0b0011_0000; // _ для удобства
        long l = 1L;

        float f = 3.14F;
        double d = 3.14;

        f = Float.NaN; // 0 / 0
        f = Float.NEGATIVE_INFINITY; // -1 / 0
        f = Float.POSITIVE_INFINITY; // +1 / 0

        d = Double.NaN;

        if (d == Double.NaN) {
            System.out.println("Impossible");
        }

        if (Double.isNaN(d)) {
            System.out.println("Ok");
        }

        d = Double.NEGATIVE_INFINITY;
        d = Double.POSITIVE_INFINITY;

        System.out.println(2.0 - 1.1);

        char c = 'D';
        c = 68;
        c = '\u2122';
        c = '\u005b';
        c = '\u005d';

        boolean bl = true; // не возможно преобразовать boolean в число и наоборот

        final double PI = 3.14; // константа
//        PI = 2;
        i1 = MY_CONST;
        i1 = LType.MY_CONST;


        System.out.println(-12 % 5);
        System.out.println(Math.floorMod(-12, 5));
        System.out.println(Math.floorMod(12, -5));
        System.out.println(floorMod(-12, -5)); // import static java.lang.Math.*;


        System.out.println("-------------------");
        System.out.println(27 % 4);
        System.out.println(floorMod(27, 4)); // 3
        System.out.println(-15 % 4);
        System.out.println(floorMod(-15, 4)); // 1
        System.out.println(113 % -3);
        System.out.println(floorMod(113, -3)); // 2
        System.out.println(-15 % -7);
        System.out.println(floorMod(-15, -7)); // 6


        // enum
        Size sz = Size.LARGE;
        System.out.println(sz == Size.SMALL);
        System.out.println(sz == Size.LARGE);
    }

    public static final int MY_CONST = 3333;
}
