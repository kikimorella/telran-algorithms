package de.telran.d221011;

import java.util.Arrays;

public class Complexity {
    public static void main(String[] args) {
        int[] nums1 = {1, 34, 12, 23, 4, 0, 2453};
        /* СЛОЖНОСТЬ ВРЕМЕННАЯ */

        //O(const) константное время
        //System.out.println(nums[nums.length - 1]);

        // O(logN) - участок под наклоном, затопила, мы делим на 2 участок и если свёкла гнилая, то идем правее, делим
        // пополам и снова выкапываем свеклу на проверку (экономия времени). например бинарный поиск

        //O(n) - линейная зависимость, линейное время (грядки в огороде)
        // for (int i = 0; i < nums.length; i++) { System.out.println(nums[i] + " "); } // чем больше массив, тем дольше


        // O(n*logn) - сложность линейно логарифмическая. пройтись по массиву обычно, а по вложенному массиву - бинарный

        /*
        100 - константная меньше, чем логарифм
        log2 8 = 3 - в какую степень возвести 2, чтоб получить 8 (3 это сложность)
        log 2 12 +-= 3.5  линейная сложность 12 = 12, логарифмическая сложность меньше
        log2 16 = 4
        log2 32 = 5
        log2 64 = 6
        log2 128 = 7
         */

        // O(n^2) - степень может увеличиваться

        // O(2^n)

        // O(n!) - факториальная сложность - задача коммивояжера (продажник с порога)
        // 3! = 1*2*3 = 6
        // 4! = 1*2*3*4 = 24
        // 5! = 1*2*3*4*5 = 120


        /* СЛОЖНОСТЬ КОДА */

        int[] nums2 = {1, -23, 4, 0, 34, 12, -23, 4, 0, 2453};
        int[][] nums3 = {
                {1, 34, 12, -23},
                {0, -23, 102, 3},
                {101, 7, 2, 113},
                {21, 304, 412, 38}
        };
        System.out.println(nums3[1][1]); //-23, т.к. от отсчёт нуля
    }

    static void method1(int[] nums) { // O(n), т.е. O(const* num.length) => O(const * n) => O(n)
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) { // если нет цикла, то O(const)
                System.out.println(nums[i]);
            }
        }
    }

    // O(min length) - если А = 0, а В - всё равно => O(1) => средний случай O(n/2)
    // если массивы равны, то O(const * A) O(const * n) O(n)
    // O(const1 + const2 * x)
    static void method2(int[] nums1, int[] nums2) { // A B
        int a = nums1.length; // 3, но  O(const1) - время не зависит - мы сразу берём длину массива
        int b = nums2.length; // 5, но O(const1)
/*
        int x = 0;
        if (a > b) { // 3 > 5
            x = b;
        } else {
            x = a; // 3
        }
 */
        int x = a > b ? b : a; // мы сравниваем буквально числа => O(const1)
//        int x = nums1.length > nums2.length ? nums2.length : nums1.length;
        // находим самую короткую длину массива, время подсчёта не будет меняться, сравниваем числа
        int[] temp = new int[x]; // массив определённой длинны тоже O(const1)

        for (int i = 0; i < x; i++) { // O (const2 * x) прошлись по циклу и если x = 100 => 100ms
            /*
            int k = nums1[i]; // O(const) - тесто
            int l = nums2[i]; // O(const) - мясо
            temp[x] = k + l; // O(const) - пельмени (1
             */
            temp[x] = nums1[i] + nums2[i]; // 1ms
        }
    }

    // худший случай 4 одинаковых массива => O (log n * nums.length), т.е. log n = nums.length => O(log n * n) => O(nlogn)
    static void method3(int[][] nums) {
        for (int i = 0; i < nums.length; i++) {
            Arrays.sort(nums[i]); // log n
        }
    }

    // O (n^2) * logn - ошибочно
    // n * logn + n^2 = n * (n + logn), мы отбрасываем меньшую степень => n^2
    static void method4(int[][] nums) { // [n][n]
        for (int i = 0; i < nums.length; i++) { // n
            Arrays.sort(nums[i]); // log n
            for (int j = 0; j < nums[i].length; j++) { // n
                System.out.println(nums[i][j]);
            }
        }
    }
}
