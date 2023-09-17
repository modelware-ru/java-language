package ru.java;

public class LFormat {
    public static void main(String[] args) {
        System.out.println("LFormat");

        double pi = 3.1415926536;
//        System.out.printf("%d", pi); // Exception
        System.out.printf("%f\n", pi); //
        System.out.printf("%.8f\n", pi); //

    }
}
