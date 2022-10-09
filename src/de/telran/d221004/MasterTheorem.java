package de.telran.d221004;

public class MasterTheorem {
//    public static void main(String[] args) {
//        static int staticCounter = 0;
//        static final int ONE_MILLION = 1000000;
//
//        Random random = new Random(); // создаём некое число
//        int x = random.nextInt(ONE_MILLION); // число от 0 до 1 000 000
//
//        int[] nums = new int[ONE_MILLION]; // пустой массив
//        for (int i = 0; i < ONE_MILLION; i++) { // заполнили случайными числами
////            nums[i] = (int) Math.round((Math.random() * 30) - 15);
//            nums[i] = (int) Math.round((random.nextInt(ONE_MILLION) * 31) - (random.nextInt(ONE_MILLION)));
 //       } //тут массив случайный массив с маленькой вероятностью повторений
//
//        System.out.println(simpleSearch(nums, nums[x]));
//        // вызов метода поиска перебором, сравнивает с нашим числом // 498000 операций
//        Arrays.sort(nums); // O (logN) // сортируем массив - логарифмическая сложность
////        int i = binarySearch(nums, x); // вызываем поиск // 324 операций
////        System.out.println(i * i);
//        // получается, что даже если 2 раза искать в binarySearch будет быстрее чем в неотсортир.массиве simpleSearch
//
////        System.out.println(myRecursion(7)); // 128 // {1,2,3,4,5,6,7}
////        System.out.println(Math.pow(2, 7)); // 128
//
//        int y = 10;
//        System.out.println(myRecursion(y));
//        System.out.println(Math.pow(2, y));
//    }

    //O(1)
    static void simpleiest(int[] nums) {
        System.out.println(nums[0]);
    }

    //O(N)
    static void simpleN(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[0] + " ");
        }
    }

    //O(N)
    static int simpleSearch(int[] nums, int x) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                return 1;
            }
        }
        return -1;
    }

    //O(N^2)
    static void examplePowN(int[] nums) {
        int[] temp = new int[nums.length]; // этот массив нам не нужен

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                temp[i] = nums[i] * nums[j]; // в каждой итерации переислользуем массив
            }
        }
    }

    // O(2^N)
    static int myRecursion(int n) {
        if (n <= 0) {
            return 1;
        } else {
//            return myRecursion(n - 1) + myRecursion(n - 1);
            return myRecursion(n - 1) + myRecursion(n - 1);
        }
    }
    /*
    Бинарное дерево
    2^0 - 7,8 - 9,10 - 11,12 - 13,14
    2^1 - 3,    4   -   5,      6
    2^2 -   1       -       2
    2^3 -           0
    */

    //O(N+N) = O)2M) = O(N)
    static void constant(int[] nums1) {
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = nums1[i] + nums1[i];
        }
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
        int[] temp = new int[100];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = i;
        }
    }
}
