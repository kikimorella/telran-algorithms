package de.telran.d220927;

public class BinarySearch {
    public static void main(String[] args) {
//        int arr[] = {2, 3, 4, 10, 40};
//        int x = 10;
//        int result = binarySearch(arr, x);
//        if (result == -1)
//            System.out.println("Element not present");
//        else
//            System.out.println("Element found at " + "index " + result);

        int[] arr = new int[10000];
        for (int i = 0; i < 10000; i++) {
            arr[i] = i;
        }

        long bsStart = System.nanoTime();
        binarySearch(arr, 99999);
        long bsFinish = System.nanoTime() - bsStart;

        long ssStart = System.nanoTime();
        lineSearch(arr, 99999);
        long ssFinish = System.nanoTime() - ssStart;

        System.out.printf("time for binary search is %d, \n teme for dimple search %d" , bsFinish, ssFinish);
    }

    public static int binarySearch(int arr[], int x) { // x = 10
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) { // {(2, 3, 4,) 10, 40}
            int m = l = (r - l) / 2; // (4 -3) / 2 = 0
            if (arr[m] == x) {
                return m;
            }
            if (arr[m] < x) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -1;
    }

    static int lineSearch(int[] nums, int x) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
