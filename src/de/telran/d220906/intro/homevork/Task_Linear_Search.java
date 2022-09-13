package de.telran.d220906.intro.homevork;

public class Task_Linear_Search {

    // Given an array arr[] of N elements, the challenge is to write a function to find a given element x in arr[] .

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int x = 5;

        int result = search(array, x);
        if (result == -1)
            System.out.print("Element is not present in array");
        else
            System.out.print("Element is present at index " + result);
    }

    public static int search(int[] array, int x) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == x)
                return i;
        }
        return -1;
    }
}
