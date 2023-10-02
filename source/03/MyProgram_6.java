package ru.java;

public class MyProgram_6 {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5); // создаем стек с максимальным размером 5

        stack.push(10); // добавляем элементы в стек
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60); // попытка добавления элемента в полный стек

        stack.displayStack(); // отображаем элементы стека

        stack.pop(); // удаляем элементы из стека
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop(); // попытка удаления элемента из пустого стека

        stack.displayStack(); // отображаем элементы стека

        stack.push(4);
        stack.push(5);

        int f = stack.peek();
        System.out.println(f);
    }
}
