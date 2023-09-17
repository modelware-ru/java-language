package ru.java;

public class LClass {
    public static void main(String[] args) {
        // 1. Создать LClassBase с медомами setI(), getI()
        LClassBase c = new LClassBase();
        c.setI(20);
        System.out.println("ret = " + c.getI());

        // 2. создадим класс LClassDerive, который extends LClassBase
        LClassDerived cd = new LClassDerived();
        cd.setI(10);
        System.out.println("ret = " + cd.getI());

        //3. изменили класс LClassDerive добавив реализацию setI()
        // повторный запуск

        //5. Добавим конструкторы без аргументов в оба класса
        // повторный запуск

        //8. Добавим конструкторы с аргументами в LClassBase
        LClassBase c1 = new LClassBase(99);
        System.out.println("ret = " + c1.getI());

        //10. Добавим конструкторы с аргументами в LClassDerive
        // super(i) в комментариях и без
        LClassDerived cd1 = new LClassDerived(99);
        System.out.println("ret = " + cd1.getI());

        // 12. То, ради чего все это делается
        LClassBase c2 = new LClassDerived();

        System.out.println("-------------");
        Process(c, 1);
        Process(cd, 2);
        Process(c1, 3);
        Process(cd1, 4);
        Process(c2, 5);

        // 13. Чтобы запретить наследование нужно final перед LClassBase
        // 14. Чтобы запретить переопределение метода - final перед LClassBase::setI

        // 15. Приведение типов. Схема
        LClassBase test1 = new LClassBase();
        LClassDerived test2 = new LClassDerived();

        if (test1 instanceof LClassBase) {
            System.out.println("test1 instanceof LClassBase");
        } else {
            System.out.println("test1 NOT instanceof LClassBase");
        }
        if (test1 instanceof LClassDerived) {
            System.out.println("test1 instanceof LClassDerived");
        } else {
            System.out.println("test1 NOT instanceof LClassDerived");
        }

        test1 = test2;
        if (test1 instanceof LClassBase) {
            System.out.println("test1 instanceof LClassBase");
        } else {
            System.out.println("test1 NOT instanceof LClassBase");
        }
        if (test1 instanceof LClassDerived) {
            System.out.println("test1 instanceof LClassDerived");
        } else {
            System.out.println("test1 NOT instanceof LClassDerived");
        }


    }

    // Принцип подстановки Барбары Лисков
    public static void Process(LClassBase cl, int i) {
        cl.setI(i);
        System.out.println(cl.getI());
    }
}
