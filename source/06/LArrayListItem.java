package ru.java;

public class LArrayListItem {
    static private int cnt = 0;

    private int counter;
    public LArrayListItem() {
        this.counter = ++cnt;
    }

    public String toString() {
        return "-> i = " + this.counter;
    }
}
