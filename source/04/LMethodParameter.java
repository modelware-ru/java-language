package ru.java;

public class LMethodParameter {
    public static void main(String[] args) {
        // 1. В Java при вызове методов все параметры передаются по значению!
        // Есть два вида параметров: примитивные типы и ссылки

        // 3. Вызов метода с примитивным параметром
        LMethodParameter lmp = new LMethodParameter();
        int i = 20;
        lmp.primitiveParameter(i);
        System.out.println("main: i = " + i);

        // 5. Вызов метода со ссылочным параметром
        LMethodParameter lmp2 = new LMethodParameter(10);
        LMethodParameter lmp3 = new LMethodParameter(20);
        lmp2.linkParameter(lmp3);
        // debug
        // несмотря на то, что параметр member - private он открыт для исправления ЛЮБОМУ экземпляру данного класса

        // 7. Обмена не произойдет
        LMethodParameter.swap(lmp2, lmp3);
    }

    // 2. Передача примитивного параметра
    public void primitiveParameter(int i) {
        i = i + 1;
        System.out.println("primitiveParameter: i = " + i);
    }

    // 4. Передача параметра по ссылке
    private int member;

    public LMethodParameter() {
        this.member = 0;
    }

    public LMethodParameter(int member) {
        this.member = member;
    }

    public void updateMember(int member) {
        this.member = member;
    }

    public void linkParameter(LMethodParameter lmp) {
        lmp.updateMember(100);
    }

    // 6. Передача параметров происходит именно по значению, а не по ссылке (утверждают некоторые авторы)
    public static void swap(LMethodParameter p1, LMethodParameter p2) {
        LMethodParameter temp = p1;
        p1 = p2;
        p2 = temp;
    }
}
