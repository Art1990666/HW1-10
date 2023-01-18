public class Main {
    public static void main(String[] args) {
        transient1();
        transient2();
        transient3();
        transient4();
        transient5();
        transient6();
        transient7();
        transient8();
        transient9();
        transient10();
    }

    public static void transient1() {
        System.out.println("HW-1!");
        for (int i = 1; i <= 10; i++) {
            System.out.printf(" Число " + i);
        }
    }

    public static void transient2() {
        System.out.println("HW-2!");
        for (int i = 10; i >= 1; i--) {
            System.out.printf(" Число " + i);
        }
    }

    public static void transient3() {
        System.out.println("HW-3!");
        for (int i = 2; i <= 17; i = i + 2)
            System.out.printf(" Число " + i);
    }

    public static void transient4() {
        System.out.println("HW-4!");
        for (int i = 10; i > -11; i = i - 1) {
            System.out.printf(" Число " + i);
        }
    }

    public static void transient5() {
        System.out.println("HW-5!");
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.printf(i + " год является високосным ");
        }
    }

    public static void transient6() {
        System.out.println("HW-6!");
        for (int i = 7; i < 97; i = i + 7) {
            System.out.printf(" Число " + i);
        }
    }

    public static void transient7() {
        System.out.println("HW-7!");
        for (int i = 1; i < 1024; i = i * 2) {
            System.out.printf(" Число " + i);
        }
    }

    public static void transient8() {
        System.out.println("HW-8!");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i < 13; i++) {
            total = total + salary;
            System.out.println(" Месяц " + i + " , сумма накоплений равна " + total + " рублей ");
        }
    }

    public static void transient9() {
        System.out.println("HW-9!");
        int salary = 29000;
        int total = 0;
        for (int i = 1; i < 13; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println(" Месяц " + i + " , сумма накоплений равна " + total + " рублей ");
        }
    }

    public static void transient10() {
        System.out.println("HW-10!");
        for (int i = 1; i < 11; i++) {
            int n = i * 2;
            System.out.println("2*" + i + " = " + n);
        }
    }
}