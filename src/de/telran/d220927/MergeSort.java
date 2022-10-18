package de.telran.d220927;

/* O(n log n)

В парадигме «разделяй и властвуй» проблема разбивается на более мелкие задачи, каждая из которых сохраняет все свойства
более крупной проблемы, кроме своего размера.
Aлгоритм делит входной массив на две половины, вызывает себя для этих двух половин, а затем объединяет две
отсортированные половины.

Шаг 1 : Разделите несортированный список на n подсписков; каждый подсписок имеет один элемент (который сортируется по одному элементу)
Шаг 2 : Объедините два списка одновременно. При объединении сравните элементы для двух подсписков и подготовьте новый отсортированный список.
Шаг 3. Выполните шаг 2 для всех пар подсписков.
Шаг 4 : Повторяйте шаги со 2 по 3 для нового списка подсписков, пока у нас не будет только один список.
*/

public class MergeSort {

    public static void main(String[] params) {
        int[] array = new int[] {7, 6, 5, 4, 3, 2, 1};
        System.out.println(arrayToString(array));
        array = mergeSort(array);
        System.out.println(arrayToString(array));
    }

    public static int[] mergeSort(int[] array) {
        int[] tmp;
        int[] currentSrc = array;
        int[] currentDest = new int[array.length];

        int size = 1;
        while (size < array.length) {
            for (int i = 0; i < array.length; i += 2 * size) {
                merge(currentSrc, i, currentSrc, i + size, currentDest, i, size);
            }

            tmp = currentSrc;
            currentSrc = currentDest;
            currentDest = tmp;

            size = size * 2;

            System.out.println(arrayToString(currentSrc));
        }
        return currentSrc;
    }

    private static void merge(int[] src1, int src1Start, int[] src2, int src2Start, int[] dest,
                              int destStart, int size) {
        int index1 = src1Start;
        int index2 = src2Start;

        int src1End = Math.min(src1Start + size, src1.length);
        int src2End = Math.min(src2Start + size, src2.length);

        if (src1Start + size > src1.length) {
            for (int i = src1Start; i < src1End; i++) {
                dest[i] = src1[i];
            }
            return;
        }

        int iterationCount = src1End - src1Start + src2End - src2Start;

        for (int i = destStart; i < destStart + iterationCount; i++) {
            if (index1 < src1End && (index2 >= src2End || src1[index1] < src2[index2])) {
                dest[i] = src1[index1];
                index1++;
            } else {
                dest[i] = src2[index2];
                index2++;
            }
        }
    }

    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
