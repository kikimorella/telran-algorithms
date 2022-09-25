package de.telran.d220920;

public class Recursion {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;


        while (true) { // программа суммирует все числа от n до 0
//        while (n != 0) {
            if (n >= 1) {
                sum += 1;
                break;
            } else {
                sum += n;
                n--;
            }
        }
        System.out.println(sum); // 15
        System.out.println(recursion(5)); // 15
        long start = System.currentTimeMillis();
        System.out.println(recursion(50));
        System.out.println(System.currentTimeMillis() - start);
    }

    // recursion(5), recursion(4), ... recursion(1) - остаются в памяти до garbage collector
    // аналог цикла, но не итерация, а вызов. нужны условия выхода для цикла
    static int recursion(int n) { // мы каждый раз создаем новый временный объект памяти
        if (n <= 1) { // recursion(5), recursion(4), ... recursion(1) - остаются в памяти до garbage collector
            return 1;
        } else {
            return recursion(n - 1);
//            return n + recursion(n - 1); // бесконечный минус, пока не закончится память
        }
    }
}
