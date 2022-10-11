package de.telran.d221011;

public class Recursion3 {
    public static void main(String[] args) {
        printNeturalNumbers1(12, 23);
        System.out.println();
        printNeturalNumbers2(34, 45);
        System.out.println();
        helperFunction(46,57);
    }

    //прямая рекурсия
    static void printNeturalNumbers1(int lower, int upper) {
        if (lower > upper) {
            return;
        }
        System.out.println(lower + " ");
        printNeturalNumbers1(lower + 1, upper);
    }

    // косвенная рекурсия
    static void printNeturalNumbers2(int lower, int upper) { // паттерн билдер
        if (lower <= upper) {
            System.out.println(lower + " ");
            lower++;
            helperFunction(lower, upper);
        } else {
            return;
        }
    }

    static void helperFunction(int lower, int upper) { // код повторяет логику другого кода, не часто, но встречается
        if (lower <= upper) {
            System.out.println(lower + " ");
            lower++;
            printNeturalNumbers2(lower, upper);
        } else {
            return;
        }
    }
}
