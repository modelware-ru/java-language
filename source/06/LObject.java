package ru.java;

import com.sun.corba.se.spi.ior.ObjectKey;

import java.util.Objects;

// 1. Все классы неявно наследуются от класса Object
// Если супер-класс не указан явно, то супер-классом является Object
//
public class LObject /*extends Object*/ {
    public void method() {
        System.out.println("LObject::method()");
    }

    public static void main(String[] args) {
        System.out.println("LObject");

        // 2. Переменную типа Object можно использовать в качестве ссылки на объект любого типа
        Object o = new LObject();
        // 3. Однако вызвать метод хранимого класса через Object нельзя
        // o.method();
        // нужно приведение типов
        LObject lo = (LObject) o;
        lo.method();

        // 4. Массивы тоже расширяют класс Object независимо от того, какие элементы они в себе хранят: примитивные или нет
        Object a1 = new LObject[10];
        ((LObject[]) a1)[0] = new LObject();

        LObject a1_1[] = new LObject[10];
        Object a1_2 = a1_1;
        a1_1[0] = new LObject();


        Object a2 = new int[10];

        // 5. Метод equals сравнивает два Object
        // реализация по умолчанию просто проверяет, является ли объект тем же самым
        LObject lo1 = new LObject();
        LObject lo2 = lo1;
        LObject lo3 = new LObject();

        // 5.1. Также можно использовать метод java.util.Objects
        System.out.println("lo1 " + (lo1.equals(lo2) ? "==" : "!=") + " lo2");
        System.out.println("lo1 " + (Objects.equals(lo1, lo2) ? "==" : "!=") + " lo2");
        System.out.println("lo1 " + (lo1.equals(lo3) ? "==" : "!=") + " lo3");
        System.out.println("lo1 " + (Objects.equals(lo1, lo3) ? "==" : "!=") + " lo3");
        System.out.println("lo1 " + (lo1.equals(null) ? "==" : "!=") + " null");
        System.out.println("lo1 " + (Objects.equals(lo1,null) ? "==" : "!=") + " null");


        // 6. Метод equals можно переопределить

        // 9. Правила написания метода equals
        // рефлексивность -
        // if x != null => x.equals(x) == true
        // симметричность
        // x.equals(y) == true, только тогда, когда y.equals(x) == true
        // транзитивность
        // если x.equals(y) == true и y.equals(z) == true, то x.equals(z) должно быть true
        // согласованность
        // если ссылки x и у не изменяются, то x.equals(y) должно всегда возвращать то же самое значение

        // x.equals(null) для x != null всегда false


        // 10. Метод hashCode()
        System.out.println("hashcode " + lo1.hashCode()); // ==
        System.out.println("hashcode " + lo2.hashCode()); // ==
        System.out.println("hashcode " + lo3.hashCode());
        // Метод используется при работе с хеш-таблицами
        // Если переопределяется equals, то должен быть переопределен и hashCode()
        // Одинаковые объекты должны возвращать одинаковый хеш.

        // 11. Метод toString()
        // Возвращает значение объекта в виде символьной строки
        // toString() автоматически вызывается при конкатенации строк
        // Object.toString() выводит имя класс и адрес объекта
        System.out.println("toString " + lo1.toString());
        System.out.println("toString " + lo1);
        System.out.println("toString " + lo2.toString());
        System.out.println("toString " + lo2);
        System.out.println("toString " + lo3.toString());
        System.out.println("toString " + lo3);

        // 13. Дополнительные методы + debug
        Class clo1 = lo1.getClass();
        System.out.println("lo1.getClass() = " + clo1);
        System.out.println("LObject");
    }

    //7. Переопределенный метод equals
    // Теперь сравнение с null будет давать true
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null) return true;
//        return false;
//    }

    //8. Правильный метод сравнения
    public boolean equals(Object o) {
        System.out.println("equals");
        if (!super.equals(o)) return false;
        // TODO: кастомизированное сравнение
        return true;
    }

    // 12.
//    public String toString() {
//        return "ok";
//    }

}
