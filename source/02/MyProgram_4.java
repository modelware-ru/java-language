package ru.java;

public class MyProgram_4 {
    public static void main(String[] args) {
        String fruit = "apple";
        int number = 10;
        char grade = 'A';

        switch (fruit) {
            case "apple":
                System.out.println("This is an apple.");
                break;
            case "banana":
                System.out.println("This is a banana.");
                break;
            default:
                System.out.println("Unknown fruit.");
        }

        switch (number) {
            case 10:
                System.out.println("The number is 10.");
                break;
            case 20:
                System.out.println("The number is 20.");
                break;
            default:
                System.out.println("Unknown number.");
        }

        switch (grade) {
            case 'A':
                System.out.println("The grade is A.");
                break;
            case 'B':
                System.out.println("The grade is B.");
                break;
            default:
                System.out.println("Unknown grade.");
        }
    }
}
