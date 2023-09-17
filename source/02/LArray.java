package ru.java;

import java.util.Arrays;

public class LArray {
    public static void main(String[] args) {
        System.out.println("LArray");

        // определение
        int[] ia1 = new int[10]; // все элементы = 0
        int ia2[] = {9,8,7,6,5,4,3,2,1,0};

        for (int i = 0; i < ia1.length; i++) {
            System.out.print(ia1[i] + ", ");
            ia1[i] = i;
        }
        System.out.println();

        // другой вариант цикла для коллекций реализующих Iterable
        for (int i : ia2) { // i - это элемент массива, а не значение индекса
            System.out.print(i + ", ");
        }
        System.out.println();

        // анонимные массивы
        for (int i : new int[] {1,2,2,3,3,3,4,4,4,4}) { // i - это элемент массива, а не значение индекса
            System.out.print(i + ", ");
        }
        System.out.println();


        String[] sa1 = new String[10]; // все элементы = null

        // установить параметры командной строки
        String[] sa2 = args; // по ссылке

        String[] sa3 = Arrays.copyOf(args, args.length); // по значению

        args[0] = "new value";

    }
}
