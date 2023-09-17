package ru.java;

/*final*/ public class LClassBase {
    private int i;

    // 6.
    public LClassBase() {
        System.out.println("LClassBase::LClassBase()");
    }

    // 9.
    public LClassBase(int i) {
        this.i = i;
        System.out.println("LClassBase::LClassBase() i = " + i);
    }

    /*final*/ public void setI(int i) {
        this.i = i;
        System.out.println("LClassBase::setI() i = " + i);
    }

    public int getI() {
        System.out.println("LClassBase::getI() i = " + i);
        return this.i;
    }
}
