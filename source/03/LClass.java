package ru.java;

public class LClass {
    public static void main(String[] args) {
        System.out.println("LClass");

        //1. Создадим экземпляр класса
        //3.  Компилироваться не будет, так как нет соответствующего конструктора
        LClass lc = new LClass();
        //5. Создадим новый экземпляр класса через конструктор с параметром
        LClass lc2 = new LClass("constructor");
        //6. Конструктор:
        // - имя совпадает с именем класса
        // - может быть несколько конструкторов
        // - может иметь или не иметь параметров
        // - не возвращает значение
        // - всегда вызывается вместе с операцией new => все объекты размещаются в динамической памяти

        // 13. напечатаем значение member
        System.out.println("->" + lc.getMember());
        System.out.println("->" + lc2.getMember());

    }

    // 2. Конструктор.
    public LClass(String s) {
        //8. установим значение. нНеявно подразумевается, что member - свойство класса
        member = 10;

        System.out.println("1.ctor: " + s);

        //9. и напечатаем его
        System.out.println("1.ctor: member = " + member);

    }

    // 4. Создадим конструтор по умолчанию
    public LClass() {
        // 10. лучше объявлять переменные явным образом
        this.member = 20;

        System.out.println("2.ctor");

        //11. и напечатаем его
        System.out.println("2.ctor: member = " + member);

    }

    // 7. создадим переменную
    private int member;

    //12. возвращение значения member
    public int getMember() {
        return this.member;
    }
}
