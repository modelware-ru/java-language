package ru.java;

public class MyProgram_3 {
    public static void main(String[] args) {
        // Логические операции && || !
        boolean a = true;
        boolean b = false;

        System.out.println("Логическое И (&&): " + (a && b)); // false
        System.out.println("Логическое ИЛИ (||): " + (a || b)); // true
        System.out.println("Логическое НЕ (!) для a: " + !a); // false
        System.out.println("Логическое НЕ (!) для b: " + !b); // true

        // Тернарная операция x < y ? x : y
        int x = 5;
        int y = 10;
        int smaller = (x < y) ? x : y;
        System.out.println("Меньшее значение: " + smaller); // 5

        // Поразрядные логические операции & | ^ ~
        int num1 = 5;  // 0101
        int num2 = 3;  // 0011

        int bitwiseAnd = num1 & num2;
        int bitwiseOr = num1 | num2;
        int bitwiseXor = num1 ^ num2;
        int bitwiseNotNum1 = ~num1;

        System.out.println("Поразрядное И (&): " + bitwiseAnd); // 1 (0001)
        System.out.println("Поразрядное ИЛИ (|): " + bitwiseOr); // 7 (0111)
        System.out.println("Поразрядное исключающее ИЛИ (^): " + bitwiseXor); // 6 (0110)
        System.out.println("Поразрядное НЕ (~) для num1: " + bitwiseNotNum1); // -6 (11111111111111111111111111111010)

        // Операции сдвига >> << >>>
        int num3 = 10;  // 1010

        int rightShift = num3 >> 2;
        int leftShift = num3 << 2;
        int zeroFillRightShift = num3 >>> 2;

        System.out.println("Сдвиг вправо (>>): " + rightShift); // 2 (0010)
        System.out.println("Сдвиг влево (<<): " + leftShift); // 40 (101000)
        System.out.println("Сдвиг вправо с заполнением нулями (>>>): " + zeroFillRightShift); // 2 (0010)
    }
}
