package de.telran.d221011;

public class Recursion1 {

    public static void main(String[] args) {
        method1(20);
    }

    static int method1(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return method2(n);
        }
    }

    static int method2(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return method3(n);
        }
    }

    static int method3(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return method4(n);
        }
    }

    static int method4(int n) {
        if (n <= 0) {
            return 0;
        } else {
            return method1(n);
        }
    }
}
