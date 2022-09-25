package de.telran.d220920;

import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {

        Stack<Integer> nums = new Stack<>(); // Он нужен, чтоб хранить порядок/последовательность
        System.out.println(nums.isEmpty());
//        Integer[] nums2 = new Integer[5]; // для Stack это не обязательно (задавать размер)

        nums.push(1); // O(n) - линейная (сложность для первого элемента)
        nums.push(2);
        nums.push(3); // Stack - Расширяет класс Вектор (абстрактный класс), имплементирует класс Лист
        nums.push(4); // Stack - Используется для рекурсии.
        nums.push(5); // правило последний вошёл, первый вышел
        nums.push(1); // используется
        nums.push(2); // Stack - динамически расширяется
        nums.push(3);
        nums.push(4);
        nums.push(10); // O(1) - константа (сложность для последнего элемента)

//        System.out.println(nums.pop()); // сняли последний элемент
//        System.out.println(nums.pop());
//        System.out.println(nums.peek()); // посмотрели, что сверху
//        System.out.println(nums.peek()); // true, 5, 4, 3, 3

        while ((nums.peek() != 5)) { // true, 10, 4, 3, 2, 1
            System.out.println(nums.pop());
        }
    }
}
