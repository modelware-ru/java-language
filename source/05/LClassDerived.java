package ru.java;

public class LClassDerived extends LClassBase{

    // 7.
    public LClassDerived() {
        System.out.println("LClassDerived::LClassDerived()");
    }

    // 11.
    public LClassDerived(int i) {
//        this.i = i;
        super(i);
        System.out.println("LClassDerived::LClassDerived() i " + i);
    }


    // 4. OVERRIDE - переопределение в подклассах
    public void setI(int i) {
        System.out.println("LClassDerived::setI() i = " + i);
        i++;
        super.setI(i);
    }


}
