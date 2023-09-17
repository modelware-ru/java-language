package ru.java;

import java.io.PrintStream;

public class LStatic {
    public static void main(String[] args) {

        // 2. Вызов статического метода
        LStatic.SMethod();

        // 5. Создадим два экземпляра класса, для демонстрации работы со статической перменной
        // Запустить под отладчиком
        LStatic st1 = new LStatic();
        LStatic st2 = new LStatic();

        st1.incrementIndex();
        st2.incrementIndex();

        st1.incrementIndex();
        st2.incrementIndex();

        // 7. Печать статической константы
        System.out.println("PI = " + LStatic.PI);
        // Изменить ее нельзя
//        LStatic.PI = 3.15;
        // Пример статической константы
        //System.out
        // Ей нельзя присвоить другое значение
//        try {
//            System.out = new PrintStream("");
//        } catch (Exception e) {
//
//        }

    }

    // 1. Статический метод может быть вызван без создания экземпляра класса
    public static void SMethod() {
        System.out.println("LStatic::SMethod()");
    }

    // 3. Статическое поле. Существует в одном экземпляре для всего класса
    private static int index = 1;

    // 4. Добавим метод увеличивающий значение переменной на 1
    public void incrementIndex() {
        System.out.println("Index = " + (LStatic.index++));
    }

    // 6. Статические константы
    public static final double PI = 3.14;
}
