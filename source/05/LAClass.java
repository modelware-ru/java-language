package ru.java;

public class LAClass {
    public static void main(String[] args) {
        //1. Создать классы LAClassBase, LAClassDerived

        //2. Нельзя создать экземпялры абстрактных классов
        // LAClassBase lc = new LAClassBase();
        //3. Но можно создать экземпляры унаследованных, неабстрактных классов, в которых реализованы все абстрактные метода
        LAClassBase lc = new LAClassDerived();

        //4. Создадим интерфейсные классы LInterface1, LInterface2
        //5. Добавим в класс LAClassDerived implementation данных интерфейсов

        // Нарисовать схему классов

        // lc.method1() - не можем вызвать
        LAClassDerived lc2 = new LAClassDerived();
        lc2.method1();
        lc2.method2();


        // 4-е модификатора доступа
        // public - нет ограничений
        // protected - пакет и все подклассы
        // private - класс
        // <не указано> - пакет (по умолчанию)
    }
}
