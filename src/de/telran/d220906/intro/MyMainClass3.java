package de.telran.d220906.intro;

// https://latosca.ru/11-3-analiz-funktsii-slozhnosti-po-programme/

import java.util.Arrays;

public class MyMainClass3 {

    public static void main(String[] args) {
        String[] arr = {"Aleks", "Thea", "Thomas", "Sergey", "Azriel"};
        System.out.println("sum = " + Arrays.toString(getNames(arr)));
    }

    private static String[] getNames(String[] arr) {
        String[] names = new String[arr.length]; // 1
        for (int i = 0; i < arr.length; i++) { // 1
            names[i] = arr[i]; // n
        }
        return names;
    }

}
