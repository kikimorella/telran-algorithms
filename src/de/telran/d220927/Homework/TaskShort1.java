package de.telran.d220927.Homework;
/*
1. Даны два целых числа x и n, напишите функцию для вычисления x^n
 решение 1 - рекурсивно O(n)
 решение 2 - улучшить решение 1 до O(lon n)
*/
public class TaskShort1 {
    public static void main(String[] args) {
        System.out.println(powNormal(3, 4));
        System.out.println(powN(3, 4));
        System.out.println(pow(3, 4));
    }

    /**
     * @param value a number
     * @param powValue a number power
     * @return raising a number to the power of another number
     */
    public static int powNormal(int value, int powValue) {
        return (int) Math.pow(value, powValue);
    }

    /**
     * @param value a number
     * @param powValue a number power
     * @return raising a number to a number power
     */
    public static int powN(int value, int powValue) {
        int result = 1;
        for (int i = 1; i <= powValue; i++) {
            result = result * value;
        }
        return result;
    }

    /**
     * @param value a number
     * @param powValue a number power
     * @return raising a number to a number power using recursion
     */
    public static int pow(int value, int powValue) {
        if (powValue == 1) {
            return value;
        } else {
            return value * pow(value, powValue - 1);
        }
    }
}
