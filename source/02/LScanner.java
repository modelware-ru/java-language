package ru.java;

//import java.nio.file.NoSuchFileException;
//import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;

// чтение данных с консоли
public class LScanner {
    public static void main(String[] args) /*throws IOException*/ {

//        Scanner in = new Scanner(System.in); // стандартный ввод
//
//        System.out.print("String: ");
//        String name = in.nextLine(); // считать строку
//
//        System.out.println("Result = " + name);
//
//        System.out.println();
//
//        System.out.print("2 Words: ");
//        String word1 = in.next(); // считать слова
//        String word2 = in.next(); // считать слова
//
//        System.out.println("Result = " + word1 + '|' + word2);

        // Ввод-вывод из файла
        String dir = System.getProperty("user.dir"); // каталог запуска
        System.out.println(dir);

        try {
            Scanner fin = new Scanner(Paths.get(dir, "example.txt"), "UTF-8");
            while (fin.hasNext()) {
                String word = fin.next();
                System.out.println("Прочитано слово: " + word);
            }
        } catch (NoSuchFileException e) {
            System.out.println("Exception 1: " + e);
        } catch (IOException e) {
            System.out.println("Exception 2: " + e);
        } catch (Exception e) {
            System.out.println("Exception 3: " + e);
        }

        // можно ловить конкретное исключение, но нужно поставить его выше в цепочке

        // можно от
        //import java.nio.file.NoSuchFileException;
        //import java.nio.file.Paths;
        //перейти к
        //import java.nio.file.*;

        // можно выбросить исключение через main()
    }
}
