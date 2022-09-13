package de.telran.d220906.intro;

import java.util.Scanner;

public class MyMainClass1 {
    /*
    Пример: Рассмотрим пример, чтобы сложить три числа и вывести сумму.

    Шаг 1: Выполнение предварительных условий
    Шаг 2: Разработка алгоритма
    Алгоритм сложения 3 чисел и вывода их суммы:
    Объявите 3 целочисленные переменные num1, num2 и num3.
    Возьмите три добавляемых числа в качестве входных данных для переменных num1, num2 и num3 соответственно.
    Объявите целочисленную переменную sum для хранения результирующей суммы трех чисел.
    Добавьте 3 числа и сохраните результат в переменной sum.
    Вывести значение переменной sum
    Шаг 3: Проверка алгоритма путем его реализации.
    */

    public static void main(String[] args) {
        // Variable to store the resultant sum
        int sum = 0;

        // Declare the object and initialize with predefined standard input object
        Scanner sc = new Scanner(System.in); // Scanner definition

        // Variables to take the input of the 3 numbers

        System.out.println("Enter the 1st number: ");
        int num1 = sc.nextInt();

        // input is an Integer
        // read by nextInt() function
        System.out.println(" " + num1);
        System.out.println("Enter the 2nd number: ");
        int num2 = sc.nextInt();
        System.out.println(" " + num2);
        System.out.println("Enter the 3rd number: ");
        int num3 = sc.nextInt();
        System.out.println(" " + num3);

        // Calculate the sum using + operator
        // and store it in variable sum
        sum = num1 + num2 + num3;
        System.out.println("Sum of the 3 numbers is = " + sum);
    }
}