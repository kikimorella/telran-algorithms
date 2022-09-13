package de.telran.d220906.intro;

public class MyMainClass4 {

    /*
    Алгоритм Евклида
    Формула НОД: НОД (a, b) = НОД (b, с), где с — остаток от деления a на b.
    1 Большее число поделить на меньшее.
    2 Меньшее число поделить на остаток, который получается после деления.
    3 Первый остаток поделить на второй остаток.
    4 Второй остаток поделить на третий и т. д.
    5 Деление продолжается до тех пор, пока в остатке не получится нуль. Последний делитель и есть наибольший общий делитель.
    */

    public static void main(String[] args) {

        int a = 124;
        int b = 234;
        long start = System.nanoTime();
        greatestCommonDeliver(a, b);
        long end = System.nanoTime();
        System.out.println("Euclidean algorithm = " + (end - start));

        start = System.nanoTime();
        getGcd(a, b);
        end = System.nanoTime();
        System.out.println("for = " + (end - start));

        start = System.nanoTime();
        getGcd2(a, b);
        end = System.nanoTime();
        System.out.println("for2 = " + (end - start));
    }

    public static void greatestCommonDeliver(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        System.out.println("gcd = " + a);
    }

    private static int getGd(int sum) {
        if (sum != 1) {
            for (int i = sum - 1; i >= 1; i--) {
                if (sum % i == 0) {
                    return i;
                }
            }
        }
        return 1;
    }

    private static void getGcd(int a, int b) {
        int gcd = 1;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }
        System.out.println("gcd = " + gcd);
    }

    private static void getGcd2(int a, int b) {
        int gcd = (a > b ? b : a);
        for (int i = gcd; i <= a && i <= b; i--) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
                break;
            }
        }
        System.out.println("gcd = " + gcd);
    }
}
/*
public class EuclideanAlgorithm {
    public static void main(String[] args) {
        int a, b, gcd;
        System.out.println("Введите A:");
        a = Integer.parseInt(getString());
        System.out.println("Введите B:");
        b = Integer.parseInt(getString());
        if (a < b) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        while (b != 0) {
            gcd = a % b;
            a = b;
            b = gcd;
        }
        System.out.println("Наибольший общий делитель равен: " + a);
    }
}
 */
