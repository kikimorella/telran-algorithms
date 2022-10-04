package de.telran.d220927.Homework;

/*
3. Имея отсортированный массив arr[] и число x, напишите функцию, которая подсчитывает вхождения x в arr[].
Ожидаемая временная сложность O(Log n)
arr[] = {1, 1, 2, 2, 2, 2, 3,}
x = 2
Вывод: 4 раза
*/
public class TaskShort3 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 2, 3};
        int x = 2;
        checkForDuplicates(arr,x);
    }

    /**
     * @param array a sorted array
     * @param x a number
     * a function that counts occurrences of x in array.
     */
    private static void checkForDuplicates(int[] array, int x) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                counter++;
            }
        }
        System.out.println("Вывод: " + counter + " раза");
    }
}

