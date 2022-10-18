package de.telran.d221018;

/*
Амортизированный анализ - используется для алгоритмов, в которых отдельные операции выполняются очень медленно, но
большинство других операций выполняются быстрее.
DynamicArray
Add: от O(1) до O(n).
1. Добавление элемента в конец – O(1);
2. Добавление элемента по индексу – О(n/2);
3. Добавление элемента в начало – O(n);
Set: O(1).
1. Изменение элемента – O(1);
Remove: от O(1) до O(n).
1. Удаление последнего – O(1);
2. Удаление элемента по индексу – О(n/2);
3. Удаление первого – O(n);

 */

public class ArrayListExmpl1 {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        System.out.println("first link nums: " + nums);
//        nums[3] = 4; // ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
        int[] temp = new int[nums.length * 2];
        System.out.println("first link temp: " + temp);

        for (int i = 0; i < nums.length; i++) { // {1, 2, 3, 0, 0, 0}
            temp[i] = nums[i];
        }

//        System.out.println(Arrays.toString(temp));
//        nums = temp;
        nums = increaseSize(nums); // изменения в обоих объектах (nums и temp)
        nums[3] = 4; // {1, 2, 3, 4, 0, 0}

//        System.out.println(Arrays.toString(nums));
        System.out.println("second link nums: " + nums);
//        System.out.println(Arrays.toString(temp));

        // лучше избегать и помнить
//        int x = 5; // лучше избегать
//        int y = x;
//        x = 6;

        int[] nums2 = {1, 2, 3};
        // удаление {0,2,3} -> {2,0,3} -> {2,3,0}  массив имеет 0, там, где мы не используем ячейки // сложность O(n/2)
    }

    // чтоб избежать ссылок на temp, проще перенести решение в отдельный метод
    private static int[] increaseSize(int[] nums) { // динамический массив
        // Random random = new Random();
        // int[] temp = new int[nums.length + random];
        int[] temp = new int[nums.length * 2];
        for (int i = 0; i < nums.length; i++) {
            temp[i] = nums[i];
        }
        nums = temp;
        return temp;
    }

    // {0,1,2,3,4,5,6,7,8,9,10} + 11 -> {0,1,2,3,4,5,6,7,8,9,10,11,0,0,0,0,0,0,0,0,0}
    // увеличение в двое (мультикативная схема). В перспективе дешевле по времени
    // {0,1,2,3,4,5,6,7,8,9,10} + 11 -> {0,1,2,3,4,5,6,7,8,9,10,11,0,0,0,0}
    // увеличение (рандомное) на константу например 5 (адитивная схема) - меньше места, но временная сложность больше

}
