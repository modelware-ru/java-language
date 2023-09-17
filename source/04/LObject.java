package ru.java;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class LObject {
    public static void main(String[] args) {
        // 2. создадим объекты
        LObject o1 = new LObject();
        LObject o2 = new LObject(1, "string", true);

        // 4. Вызов конструктора из конструктора
        LObject o3 = new LObject(12);
    }
    // 1. У классов может быть несколько конструкторов. Они должны отличаться набором параметров.
    // Используют термин "перегрузка"
    // "Перегружать" можно любые методы
    // override - переопределение метода в подклассе toString()
    // overload - перегрузка. метод с тем же именем, но другим набором параметров
    private int i;
    private String s;
    private boolean b;

    // если проинициализировать переменную, то значение будет установлено ДО вызова конструктора
    private int j = 100;
    // можно инициализировать переменную вызовом статического метода
    private int k = assignK();
    // Если не определен ни один конструктор, то создается конструктор без аргументов
    public LObject() {
        // по умолчнию
//        this.i = 0;
//        this.s = null;
//        this.b = false;
        System.out.println("LObject::LObject()");
    }

    public LObject(int i, String s, boolean b) {
        this.i = i;
        this.s = s;
        this.b = b;
        System.out.println("LObject::LObject(), i = " + i);
    }

    private static int assignK() {
        return 200;
    }

    // 3. Можно вызвать один конструктор из другого
    public LObject(int i) {
        // вызов конструктора
        // this должен быть первым методом
        this (i, "string i", false);
    }

    // 5. Для инициализации перменных можно использовать блоки инициализации
    {
        System.out.println("object block");
    }

    static  {
        System.out.println("class block");
    }

    // 6. Деструктора нет, но есть метод, который вызывается при удалении объектов (память чистится GC)
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize() i = " + i);
        super.finalize();
    }
}
