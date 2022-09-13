package de.telran.d220906.intro.homevork;

public class Task_Binary_Search {

    // Given an array arr[] of N elements, the challenge is to write a function to find a given element x in arr[] .

    public static void main(String[] args) {

        int[] sortedArray = {0, 5, 14, 28, 32, 52, 58, 71, 82, 84, 92, 95, 100};
        System.out.println(binarySearch1(sortedArray, 82));
        binarySearch2(sortedArray, 52);
    }

    static int binarySearch1(int[] array, int number) {
        int minIndeks = 0; // first index
        int maxIndeks = array.length - 1; // last index
        int middleIndex = 0;

        while (minIndeks <= maxIndeks) {
            middleIndex = (minIndeks + maxIndeks) / 2;

            if (array[middleIndex] < number) { // элемент больше среднего, искать справа
                minIndeks = middleIndex + 1;
            } else if (array[middleIndex] >= number) { // элемент меньше среднего, искать слева
                maxIndeks = middleIndex - 1;
            } else {
                return middleIndex; // если элемент посередине
            }
        }

        return -1; // мы не нашли число
    }

    static void binarySearch2(int[] sortedArray, int requiredNumber) {
        int first = 0;
        int last = sortedArray.length - 1;
        int middle = (first + last) / 2;

        boolean isFound = false;

        while (first <= last) { // проходимся по массиву до середины
            if (sortedArray[middle] < requiredNumber) { // если число больше значения среднего индекса
                first = middle + 1; // ищем число во второй половине массива
            } else if (sortedArray[middle] == requiredNumber) { // если число равно значению среднего индекса
                isFound = true; // мы его нашли
                break; // дальнейший поиск не имеет смысла
            } else { // если число меньше значения среднего индекса
                last = middle - 1; // ищем число в первой половине массива
            }
            middle = (first + last) / 2; // если нам нужно продолжить поиск, ищем новую середину
        }

        if (isFound) { // мы нашли число
            System.out.println(requiredNumber + " found at index " + middle);
        } else System.out.println(requiredNumber + " is not present"); // если числа в массиве нет
    }

    public int binarySearch3(int array[], int left, int right, int x) {
        left = 0;
        right = array.length - 1;

        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (array[mid] == x) // если элемент посередине
                return mid;

            if (array[mid] > x) // элемент меньше среднего, искать слева
                return binarySearch3(array, left, mid - 1, x);

            return binarySearch3(array, mid + 1, right, x); // значит, элемент должен быть справа
        }

        return -1; // мы не нашли число
    }
}
