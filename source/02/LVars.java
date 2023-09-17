package ru.java;

public class LVars {
//    @SuppressWarnings("fallthrough")
    public static void main(String[] args) {
        System.out.println("LVars");
        int i1 = 1;
        {
            int i2 = 2;

            System.out.printf("i1 (inside) = %d\n", i1);
            System.out.printf("i2 (inside) = %d\n", i2);

//            int i1 = 3; // нельзя переопределить в блоке

        }
        System.out.printf("i1 = %d\n", i1);
//        System.out.printf("i2 = %d\n", i2);


        i1 = 1;
        i1 = 2;
        i1 = 3;
        if (i1 == 1) {
            System.out.println("if1 :" + i1);
        } else if (i1 == 2) {
            System.out.println("if2 :" + i1);
        } else {
            System.out.println("if3 :" + i1);
        }

        while (i1 > 0) {
            System.out.println("while :" + i1);
            i1--;
        }

//        i1 = 4;
        do {
            System.out.println("do-while :" + i1);
            i1--;
        } while (i1 > 0);

        for (i1 = 0; i1 < 3; i1++) {
            System.out.println("for :" + i1);
        }

        i1 = 2;
        switch (i1) {
            case 1:
                System.out.println("switch1 :" + i1);
                break;
            case 2:
                System.out.println("switch2 :" + i1);
                break;
            default:
                System.out.println("switchdef :" + i1);
                break;
        }

        // убрать один break и запустить все так, чтобы провалился один case
        // добавить Settings -> Java Compiler  -Xlint:fallthrough
        // При сборке будет warning
        //  чтобы его скрыть - написать аннотацию - @SuppressWarnings("fallthrough")

        // использование меток
        // сначала просто цикл
        // затем c простым break
        // затем с двумя метками
//        label1:
        for (int i = 0; i < 5; i++) {
//            label1:
            for (int j = 0; j < 5; j++) {
//                if (j > 3) break label1;
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }

        // отличие break от continue
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
//                if (j == 3) break;
//                if (j == 3) continue;
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }

    }
}
