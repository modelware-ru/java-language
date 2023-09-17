package ru.java;

import java.util.Arrays;

// Многомерные массивы
public class LArray2 {
    public static void main(String[] args) {
        System.out.println("LArray2");

        // нужно объявить
        double[][] array2D;
        // нужно инициализровать
        array2D = new double[9][9];

        // если заранее известны размеры и элементы
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        // печатаем элемент
        System.out.println(matrix[0][0]);
        // следующие две строки идентичны
        System.out.println(matrix);
        System.out.println(matrix.toString());

        // обработка в цикле
        for (int[] row : matrix) {
            for (int value : row) {
//                System.out.print(value + '|'); // 123 ! не верно
                System.out.printf("%d|", value ); // верно
            }
            System.out.println();
        }

        // способ быстро вывести массив на экран
        System.out.println(Arrays.deepToString(matrix));

        // строки (не столбцы!) массива легко переставлять
        int[] tmp = matrix[0];
        matrix[0] = matrix[1];
        matrix[1] = tmp;

        System.out.println(Arrays.deepToString(matrix));

        // неровные массивы
        int[][] example = new int[5][]; // инициализированы только строки
        example[0] = new int [1];
        example[1] = new int [2];
        example[2] = new int [3];
        example[3] = new int [4];
        example[4] = new int [5];

        System.out.println(Arrays.deepToString(example));

    }

}
