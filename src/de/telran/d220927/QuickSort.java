package de.telran.d220927;

// не на много быстрее bubble, но сложнее

public class QuickSort {
    public static void main(String[] args) { // всегда откидываем последний элемент
        int[] array1 = {17, 25, 11, 16, 10, 13, 22, 14};
        int[] array2 = {12, 6, -45, 56, 888};
        quickSort(array1, 0, array1.length - 1);
    }

    public static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(array, left, right);
            quickSort(array, left, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, right);
        }
    }

    /* This function takes last element as pivot, places the pivot element at its correct position in sorted array, and
    places all smaller (smaller than pivot) to left of pivot and all greater elements to right of pivot */
    public static int partition(int[] array, int left, int right) { //({12, 6, -45, 56, 888}, 0, 4)
        int pivot = array[right]; // choose the rightmost element as the pivot // pivot = 888
        int partitionIndex = left; // the first element greater than the pivot // = 0

        for (int i = left; i < right; i++) {  // move large value into the right side of the array // from 0 to 4
            if (array[i] <= pivot) { // may be used '<' as well // array[i] <= 888
                swap(array, i, partitionIndex); //({12, 6, -45, 56, 888}, 1, 0)
                partitionIndex++;
            }
        }

        swap(array, partitionIndex, right); // put the pivot on a suitable position

        return partitionIndex;
    }

    public static void swap(int[] array, int i, int j) { //({12,6,-45,56,888}, 1, 0) => ({6,12,-45,56,888})
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
