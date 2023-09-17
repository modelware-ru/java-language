package ru.java;

public class LAClassDerived extends LAClassBase implements LInterface1, LInterface2{
    @Override
    public int getI() {
        return this.i;
    }

    public void method1() {
        System.out.println("LAClassDerived::method1()");
    }

    public void method2() {
        System.out.println("LAClassDerived::method2()");
    }

}
