package de.telran.d220927.Homework;

import java.util.Arrays;

/*
Найдите пиковый элемент в двумерном массиве
Элемент является пиковым, если он больше или равен своим четырем соседям слева, справа, сверху и снизу. Например,
соседями для A[i][j] являются A[i-1][j], A[i+1][j], A[i][j-1] и A[i][j+1 ]. Для угловых элементов отсутствующие соседи
считаются отрицательными бесконечными значениями.
10 20 15
21 30 14
 7 16 32
Выход: 30
30 — пиковый элемент, потому что все его соседи меньше или равны ему.
32 также можно выбрать в качестве пика.

note
1 Смежная диагональ не считается соседней.
2 Пиковый элемент не обязательно является максимальным элементом. (к сожалению, находит именно максимальный)
3 Таких элементов может быть несколько. (решение должно быть через list?)
4 Всегда есть пиковый элемент.
*/
public class TaskTop {
    public static void main(String[] args) {
        int[][] myArray = {{10, 20, 10}, {20, 40, 60}, {40, 10, 20}};
        System.out.println(Arrays.deepToString(myArray));
        findPeakElt(myArray);
        System.out.println("---");
        int[][] array = {{10, 20, 15}, {21, 30, 14}, {7, 16, 32}};
        printDoubleArray(array);
        findPeakElt(array);
    }

    /**
     * @param: return max of peek positions with coordinates.
     */
    public static void findPeakElt(int[][] arr) {
        int max = 0;
        int row = 0;
        int col = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > 0 && arr[i][j] > max) {
                    if (arr[i][j] > max) {
                        max = arr[i][j];
                        row = i;
                        col = j;
                    }
                }
            }
        }
        System.out.println("max:" + max + "\nindex: row=" + row + " col=" + col);
    }

    /**
     * @param: An integers array.
     * @return: return any of peek positions.
     */
    public int findPeak(int[] num) {
        int max = num[0];
        int res = 0;
        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
                res = i;
            }
        }
        return res;
    }

    /**
     * @param: An integers array.
     */
    public int findPeakElement(int[][] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max > arr[i][j + 1] && max > arr[i][j - 1]) {
                    if (max > arr[i + 1][j] && max > arr[i - 1][j]) {
                        max = arr[i][j];
                    }
                }
            }
        }
        return max;
    }

    /**
     * @param: that prints an array
     */
    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /**
     * @param: that prints out an array of arrays
     */
    static void printDoubleArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            printArray(array[i]);
        }
        System.out.println();
//        for (int[] row: array)
//        {
//            if (row != null) // чтобы избежать NullPointerException если какой-либо массив равен нулю.
//            {
//                for (int col: row) {
//                    System.out.print(col + " ");
//                }
//            }
//            System.out.println();
//        }
    }

}
