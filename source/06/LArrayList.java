package ru.java;

import java.util.ArrayList;

public class LArrayList {
    public static void main(String[] args) {
        // 1. Для объявления массива нужно знать его размер
        // После инициализации размер изменить нельзя
        int size = 20;
        LArrayListItem[] items = new LArrayListItem[size];

        // 2. Для динамического изменения размера можно использовать ArrayList
        // LArrayListItem в угловых скобках - обобщенный тип параметра
        ArrayList<LArrayListItem> al = new ArrayList<>();
        // можно указать емкость массива
//        ArrayList<LArrayListItem> al = new ArrayList<>(size);

        // можно заранее установить емкость массива, если она известна
        // если это не сделать - память будет выделяться динамически при переполнении
        // и все элементы будут копироваться в новую область памяти
        al.ensureCapacity(size * 2);

        // add() возвращает true, если элемент добавлен
        al.add(new LArrayListItem());
        al.add(new LArrayListItem());
        al.add(new LArrayListItem());
        al.add(new LArrayListItem());
        al.add(new LArrayListItem());
        al.add(new LArrayListItem());
        al.add(new LArrayListItem());


        // сокращает емкость до существующего размера
        // "лишняя" память возвращается в систему через GC
        al.trimToSize();

        // число элементов в массиве
        System.out.println("size = " + al.size());

        // замена i-го элемента
        al.set(1, new LArrayListItem());

        // добавить элемент перед i-ым
        al.add(1, new LArrayListItem());

        // получение i-го элемента
        LArrayListItem la1 = al.get(1);
        // удаление i-го элемента
        LArrayListItem la2 = al.remove(1);
    }
}
