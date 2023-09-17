package ru.java;

import java.util.ArrayList;

public class LWrapper {
    public static void main(String[] args) {
        // 1. Иногда нужно переменный примитивных типов преобразовать в объекты
        // Также возможна обратная операция.
        // Boxing (упаковка) & unboxing (распаковка)

        // Примеры boxing
        // изменить значения после инициализации НЕЛЬЗЯ
        Integer iobj1 = new Integer(5); // Посмотреть реализацию. Нельзя изменить значение
        Long lobj1 = new Long(1L);
        Float fobj1 = new Float(12.4F);
        Double dobj1 = new Double(12.5);
        Short sobj1 = new Short((short) 4);
        Byte bobj1 = new Byte((byte) 3);
        Character cobj1 = new Character('e');
        Boolean blobj1 = new Boolean(true);

        // Примеры autoboxing
        Integer iobj2 = 5;
        Long lobj2 = 1L;
        Float fobj2 = 12.4F;
        Double dobj2 = 12.5;
        Short sobj2 = 4;
        Byte bobj2 = 3;
        Character cobj2 = 'e';
        Boolean blobj2 = true;

        System.out.println("iobj1 " + (iobj1.equals(iobj2) ? "==" : "!=") + " iobj2");
        System.out.println("lobj1 " + (lobj1.equals(lobj2) ? "==" : "!=") + " lobj2");
        System.out.println("fobj1 " + (fobj1.equals(fobj2) ? "==" : "!=") + " fobj2");
        System.out.println("dobj1 " + (dobj1.equals(dobj2) ? "==" : "!=") + " dobj2");
        System.out.println("sobj1 " + (sobj1.equals(sobj2) ? "==" : "!=") + " sobj2");
        System.out.println("bobj1 " + (bobj1.equals(bobj2) ? "==" : "!=") + " bobj2");
        System.out.println("cobj1 " + (cobj1.equals(cobj2) ? "==" : "!=") + " cobj2");
        System.out.println("blobj1 " + (blobj1.equals(blobj2) ? "==" : "!=") + " blobj2");

        // unboxing
        int i1 = iobj1;
        long l1 = lobj1;
        float f1 = fobj1;
        double d1 = dobj1;
        short s1 = sobj1;
        byte b1 = bobj1;
        char c1 = cobj1;
        boolean bl1 = blobj1;

        int i2 = iobj2.intValue();
        long l2 = lobj2.longValue();
        float f2 = fobj2.floatValue();
        double d2 = dobj2.doubleValue();
        short s2 = sobj2.shortValue();
        byte b2 = bobj2.byteValue();
        char c2 = cobj2.charValue();
        boolean bl2 = blobj2.booleanValue();

        // 2. Нельзя использовать в обобщенных объектах примитивные типы
//        ArrayList<int> iArr = new ArrayList<int>();
        ArrayList<Integer> iArr = new ArrayList<Integer>(); // это менее эффективно, чем int[]

        iArr.add(1); // автоматически преобразуется в
        iArr.add(new Integer(1));

        int item = iArr.get(0); // автоматически преобразуется в
        item = iArr.get(0).intValue();

        // debug (меняется адрес)
        Integer n = 10; // упаковка
        n++; // распаковка, увеличение на 1, упаковка

        int a = 10;
        int b = 10;
        System.out.println("a " + ((a == b) ? "==" : "!=") + " b");
        Integer aI = 10;
        Integer bI = 10;
        System.out.println("aI " + ((aI == bI) ? "==" : "!=") + " bI"); // сравнение адресов памяти
        System.out.println("aI " + ((aI.equals(bI)) ? "==" : "!=") + " bI");

        try {
            Integer var = null;
            System.out.println(var + 1);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurs");
        }

        Integer int1 = 1;
        Double dbl1 = 2.0;
        // Integer распаковывоется, приводится к double и упаковывается в Double
        System.out.println((true) ? int1 : dbl1);

        // Важно: За упаковку и распаковку отвечает компилятор, а не виртуальная машина.
        // Т.е. компилятор генерирует дополнительный код

        // Классы-обертки примитивных типов содержат статические методы
        System.out.println(Integer.parseInt("123")); // return int
        System.out.println(Integer.parseInt("123", 16)); // return int
        System.out.println(Integer.valueOf("123")); // return Integer
        System.out.println(Integer.valueOf("123", 16)); // return Integer
    }
}
