package de.telran.d220913;

import java.util.ArrayList;
import java.util.List;

/*
Для оценки сложности алгоритмов в программировании создали специальное обозначение под названием Big-O (“большая О”).
Big-O позволяет оценить, насколько время выполнения алгоритма зависит от переданных в него данных.
Big-O оценивает именно сам алгоритм, независимо от “окружающей среды” в которой ему придется работать.

Память дешевле времени, чаще предпочтение отдают именно времени
*/

public class BigONotation {

    public static void main(String[] args) {

    }

    public static void method(int a, int b) { // лучший O(1) , худший O(n)
        while (a != b) { // константа - O(1), т.е. один случай a=b
            if (a > b) { // мы можем посчитать, вне зависимости от значений a и b
                a = a - b;
            } else {
                b = b - a;
            }
        }
    }

    public static void bubleFor(int n) {
        for (int i = 0; i <= n / 3; i++) { // O(n/3)
            for (int j = 1; j <= n; j = j + 4) {  // O(n/4)
                System.out.println("Hello world!");
            }
        }
    }


    public static void fork(int n) { // лучший - константа 2, худшая O(n). При определённом условии, лучшее О(1)
        if (n < 5) {
            System.out.println("number < 5"); // стоит 1
        } else {
            for (int i = 0; i < n; i++) {
                System.out.println(i); // стоит 1 или 1 * n
            }
        }
    }

    public static int factorial(int x) {
        if (x == 1) {
            return 1;
        }
        return x * factorial(x - 1);
    }

    public static int listSum(String[] array) {
        int res = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            char[] chars = array[i].toCharArray();
//           array[i].contains("a");
            for (int j = 0; j < chars.length; j++) {
                System.out.println(chars[j]);
            }
//            res = array[i] + 1;
//            list.add(res);
        }
        return res;
    }

    public static int meth(int one, int two) {
        int result = one + two; // стоит - 2
        return result; // стоит - 1
    }
// Последовательное исполнение:
// 1 единица времени на арифметические и логические операции
// 1 единица времени для операторов присваивания и возврата
// (sum) = 2 + 1 = 3 ==> O(3) -> 3 is constant ==> Time complexity = O(2) = O(1)
}
