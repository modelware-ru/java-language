package ru.java;

        import java.lang.reflect.Constructor;
        import java.lang.reflect.Field;
        import java.lang.reflect.Method;

public class LReflection {
    public static void main(String[] args) {
        // 1. Манипулирование java-кодом в динамическом режиме

        LReflection r = new LReflection();
        Class c = r.getClass();
        System.out.println(c.getName());

        // 3. Создание экземпляра класса
        LReflection r1 = null;
        try {
            r1 = r.getClass().newInstance();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        String s = "ru.au.java.LReflection";
        LReflection r2 = null;
        try {
            r2 = (LReflection) Class.forName(s).newInstance();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        r1.pFunc1();

        // 4. Внутреннее устройство класса
        // все public данные
        Constructor[] ctors =  r1.getClass().getConstructors();
        // все данные, определенные в классе
        Constructor[] dctors =  r1.getClass().getDeclaredConstructors();

        // все public данные
        Method[] methods = r1.getClass().getMethods();
        // все данные, определенные в классе
        Method[] dmethods = r1.getClass().getDeclaredMethods();

        // все public данные
        Field[] fields = r1.getClass().getFields();
        // все данные, определенные в классе
        Field[] dfields = r1.getClass().getDeclaredFields();
    }

    // 2.
    public int i;
    private char c;
    public void pFunc1() {
        System.out.println("pFunc1()");
    }

    public LReflection() {

    }

    private LReflection(int i) {
        this.i = i;
    }

    protected int pFunc2(int i) {
        System.out.println("pFunc2()");
        return 1;
    }

    private LReflection pFunc3(LReflection r) {
        System.out.println("pFunc3()");
        return r;
    }

}
