package de.telran.d220927;

public class MergeSort {

    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};

        System.out.println("Given Array");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        printArray(arr);
    }

    /**
     Merges two subarrays of arr[].
     First subarray is arr[l..m]
     Second subarray is arr[m+1..r]
     */
    void merge(int arr[], int l, int m, int r) {

        int n1 = m - l + 1; // Find sizes of two subarrays to be merged
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        /* Merge the temp arrays */

        int i = 0, j = 0; // Initial indexes of first and second subarrays

        int k = l; // Initial index of merged subarray array // k=1, i=1, j=1
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) { // {1, 2, 2, 3} but 2 <-> 2
                arr[k] = L[i]; // {3, 4, 5, 6, 7, 8} --> {3, 4, 5} {6, 7, 8}
                i++;
            } else {
                arr[k] = R[j]; // k=4, i=4, j=1 {3, 4, 5, 1, 7, 8} --> {3, 4, 5} {1, 7, 8} -->
                j++; // { 1, 4, 5, 1, 7, 8} --> {1, 3, 4, 5, 7, 8}
            }
            k++;
        }

        while (i < n1) { // Copy remaining elements of L[] if any
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) { // Copy remaining elements of R[] if any
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    /**
     Main function that sorts arr[l..r] using merge()
     */
    void sort(int arr[], int l, int r) {
        if (l < r) {
            int m = l + (r - l) / 2; // Find the middle point // {12, 11, 13, 5, 6, 7} m = 1

            sort(arr, l, m); // Sort first and second halves // {12, 11, 13, 5, 6, 7} , 0, 0}
            sort(arr, m + 1, r); // {12, 11, 13, 5, 6, 7} , 1, 1}

            merge(arr, l, m, r); // Merge the sorted halves
        }
    }

    /**
     A utility function to print array of size n
     */
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
