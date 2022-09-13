package de.telran.d220906.intro;

public class MyMainClass2 {
   /*
    Space complexity
    Рассмотрим приведенный ниже алгоритм линейного поиска.

    Шаг 1: Получить массив в arr и число для поиска в x
    Шаг 2: Начните с крайнего левого элемента arr[] и один за другим сравните x с каждым элементом arr[]
    Шаг 3: Если x соответствует элементу Print True.
    Шаг 4: Если x не совпадает ни с одним из элементов, выведите False.
    */

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println("sum = " + getNumber(arr, 6));
    }

    private static boolean getNumber(int[] arr, int number) { // 1
        for (int i = 0; i < arr.length; i++) { // 1
            if (arr[i] == number) {
                return true;
            }
        }
        return false;
    }

}
