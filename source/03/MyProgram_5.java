package ru.java;

public class MyProgram_5 {
    public static void main(String[] args) {
        System.out.println("Количество аргументов командной строки: " + args.length);

        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
        }
    }
}
