package ru.java;

public class ArrayStack {
    private final int maxSize; // максимальный размер стека
    private final int[] stackArray; // массив, используемый для реализации стека
    private int top; // индекс вершины стека

    public ArrayStack(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // инициализируем вершину стека значением -1 (т.е. стек пуст)
    }

    public void push(int element) {
        if (isFull()) {
            System.out.println("Стек полон. Невозможно добавить элемент.");
        } else {
            stackArray[++top] = element; // увеличиваем top и добавляем элемент в массив
            System.out.println("Элемент " + element + " добавлен в стек.");
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Стек пуст. Невозможно удалить элемент.");
        } else {
            int poppedElement = stackArray[top--]; // удаляем элемент из массива и уменьшаем top
            System.out.println("Элемент " + poppedElement + " удален из стека.");
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Стек пуст.");
            return -1;
        } else {
            return stackArray[top]; // возвращаем элемент на вершине стека без его удаления
        }
    }

    public boolean isEmpty() {
        return (top == -1); // возвращает true, если стек пуст, иначе false
    }

    public boolean isFull() {
        return (top == maxSize - 1); // возвращает true, если стек полон, иначе false
    }

    public void displayStack() {
        if (isEmpty()) {
            System.out.println("Стек пуст.");
        } else {
            System.out.print("Элементы стека: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }
}
