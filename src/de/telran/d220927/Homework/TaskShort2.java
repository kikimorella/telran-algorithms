package de.telran.d220927.Homework;

/*
2. Имея два отсортированных массива размера m и n соответственно, вам нужно найти элемент, который будет находиться на
k-й позиции в конечном отсортированном массиве.
Массив 1 - 100 112 256 349 770
Массив 2 - 72 86 113 119 265 445 892
к = 7
Вывод : 256
Окончательный отсортированный массив -
72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892
7-й элемент этого массива равен 256.
*/
public class TaskShort2 {
    public static void main(String[] args) {
        int[] array1 = {100, 112, 256, 349, 770};
        int[] array2 = {72, 86, 113, 119, 265, 445, 892};
        int k = 7;

        int[] array3 = sortedArrayMerge1(array1, array2);
        int[] array4 = sortedArrayMerge2(array1, array2);
        int[] array5 = sortedArrayMerge3(array1, array2);

        System.out.println(array3[k]);
        System.out.println(array4[k]);
        System.out.println(array5[k]);
    }

    /**
     * @param a sorted array
     * @param b sorted array
     * @return a new sorted array consisting of the previous two
     */
    public static int[] sortedArrayMerge1(int[] a, int[] b) {

        int[] newSortedArr = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                newSortedArr[k] = a[i];
                i++;
            } else {
                newSortedArr[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < a.length) {
            newSortedArr[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length) {
            newSortedArr[k] = b[j];
            j++;
            k++;
        }

        return newSortedArr;
    }

    /**
     * @param a sorted array
     * @param b sorted array
     * @return a new sorted array consisting of the previous two (less code and more efficient)
     */
    public static int[] sortedArrayMerge2(int[] a, int[] b) {
        int[] newSortedArr = new int[a.length + b.length];
        int i = a.length - 1, j = b.length - 1, k = newSortedArr.length;

        while (k > 0)
            newSortedArr[--k] = (j < 0 || (i >= 0 && a[i] >= b[j])) ? a[i--] : b[j--];
        return newSortedArr;
    }

    /**
     * @param a sorted array
     * @param b sorted array
     * @return a new sorted array consisting of the previous two (we use arraycopy)
     */
    private static int[] sortedArrayMerge3(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                result[k++] = a[i];
                i++;
            } else {
                result[k++] = b[j];
                j++;
            }
        }
        System.arraycopy(a, i, result, k, (a.length - i));
        System.arraycopy(b, j, result, k, (b.length - j));
        return result;
    }
}
