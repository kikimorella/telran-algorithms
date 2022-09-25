package de.telran.d220920;

import java.util.Scanner;

public class BasicKnowlege {
    public static void main(String[] args) {
        // ТИПЫ ДАННЫХ: - хранятся в стэке

        // целочисленные
        byte b1 = 10; // 8 бит
        short s = 12; // 16 бит
        int i = 14; // 32 бит
        long l = 128l; // 62 бит - 0 и 1

        //числа с плавающей точкой
        float f = 10.0f;
        double d = 10.0;

        // символьные примитивы
        char c = 'a';

        //логический примитив
        boolean bool = true;

        // ссылочные типы данных - все остальные, значение переменной хранится в хипе
        // стэк - каталог, а хип - библиотека
        String str = "Hello"; // в стэке хранится название и ссылка
        String[] str2 = {"Hello"};
        str = "friend"; // теперь объекты занимают место, но не используются (кушают память)
        str = "bye";
        Scanner scanner = new Scanner((System.in));
        str = scanner.nextLine();
        scanner.close();
// ранее scanner работал постоянно, хотя мы его использовали 1 раз, так мы его закрыли -> больше не объект памяти

        System.gc();
// сборщик мусора, должен пройтись по памяти, определить не использованные объекты и их удалить (ест процессорное время)
        System.gc(); // можно вызывать много раз, может не сработать
        System.gc(); // теперь вызывается сам, когда отработана программа

        System.out.println(str);
        System.out.println(str2);
    }
}
