package ru.java;

public class MyProgram_1 {
    public static void main(String[] args) {
        String str = "Пример строки";

        // Методы длины и сравнения
        int length = str.length();
        System.out.println("Длина строки: " + length);

        String anotherStr = "Другая строка";
        boolean equals = str.equals(anotherStr);
        System.out.println("Строки равны? " + equals);

        // Методы доступа к символам
        char firstChar = str.charAt(0);
        System.out.println("Первый символ: " + firstChar);

        int indexOfChar = str.indexOf('и');
        System.out.println("Индекс символа 'и': " + indexOfChar);

        // Методы подстроки
        String substring = str.substring(7);
        System.out.println("Подстрока, начиная с индекса 7: " + substring);

        String substring2 = str.substring(3, 9);
        System.out.println("Подстрока, начиная с индекса 3 до 9: " + substring2);

        // Методы замены
        String replacedStr = str.replace('р', 'л');
        System.out.println("Строка после замены 'р' на 'л': " + replacedStr);

        String replacedStr2 = str.replaceAll("стр", "сл");
        System.out.println("Строка после замены всех вхождений 'стр' на 'сл': " + replacedStr2);

        // Методы разделения
        String[] splitStr = str.split(" ");
        System.out.println("Строка разделена по пробелу:");
        for (String s : splitStr) {
            System.out.println(s);
        }

        // Методы преобразования
        String upperCaseStr = str.toUpperCase();
        System.out.println("Строка в верхнем регистре: " + upperCaseStr);

        String lowerCaseStr = str.toLowerCase();
        System.out.println("Строка в нижнем регистре: " + lowerCaseStr);
    }
}
