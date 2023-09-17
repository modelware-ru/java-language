package ru.java;

public class LString {
    public static void main(String[] args) {

        // Строки не изменяемы!
        String str1 = "Test";
        String str2 = "Test" + "Test";
        String str3 = "Test" + 19; // Приведение к строке
        String str4 = "Test" + 19 + 1; // Приведение к строке
        String str5 = "Test" + (19 + 1); // Приведение к строке

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(String.join("-!-", "one", "two", "three"));

        System.out.println(str2.substring(0,2)); // с i-ой позиции по j-1

        // Сравнение строк
        String str6 = "Hello";
        String str7 = "Hello";
        String str8 = "H"+"e"+"l"+"l"+"o";

        String tmpStr = "H"+"e"+"l";
        String str9 = tmpStr +"l"+"o";

        System.out.println("1: " + (str6 == str7));   // true - один адрес памяти
        System.out.println("2: " + (str6 == "Hello")); // true - один адрес памяти

        System.out.println("3: " + (str9 == str7)); // false - разные адреса памяти
        System.out.println("4: " + (str9 == "Hello")); // false - разные адреса памяти

        System.out.println("5: " + (str9.equals(str7))); // true - одно содержимое
        System.out.println("6: " + (str9.equals("Hello"))); // true - одно содержимое

        // Нулевая строка
        String str10 = null;

        if (str10 == null) {
            System.out.println("10-1: null string");
        } else {
            System.out.println("10-1: NOT null string");
        }

        str10 = "";
        if (str10.length() == 0) {
            System.out.println("10-2: empty string");
        } else {
            System.out.println("10-2: NOT empty string");
        }

        if (str10 == null) {
            System.out.println("10-3: null string");
        } else {
            System.out.println("10-3: NOT null string");
        }

        String str11 = new String();
        if (str11.length() == 0) {
            System.out.println("11: empty string");
        } else {
            System.out.println("11: NOT empty string");
        }

        if (str11 == null) {
            System.out.println("11: null string");
        } else {
            System.out.println("11: NOT null string");
        }


//        StringBuilder sb1 = "TestString";
        StringBuilder sb1 = new StringBuilder("TestString");
        sb1.append("12345");
        sb1.append('d');

        String str12 = sb1.toString();

        System.out.println(sb1);
        System.out.println(str12);

        // замена символа в 0-ой позиции
        sb1.setCharAt(0, 'Z');
        System.out.println(sb1);

    }
}
