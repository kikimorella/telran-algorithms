package de.telran.d220920;

public class TestFact {

    static int count;

    public static void main(String[] args) {
        int fact = 1;
        int n = 5;

        while (n >= 1) { // interrupt loop (условие прерывания цикла)
            fact *= n;
            n--;
        }

        // аналог base case: test.withApple(test).withApple(test)

//        func1(); // логически бесконечный вызов
//        func2(); // StackOverflowError - дебаг Сtrд + курсор

//        Stack<T> stack = new Stack<T>();
// алгоритм увеличевается линейно, не константное (одинаковое) время Stack 5 элементов это не Stack 20 элементов
//        stack.push(func1());
//        stack.push(func1());
//        stack.push(func1());
//        stack.push(func1());
//        stack.push(func1());
//        ...

        System.out.println(factorial(0)); // 1
        System.out.println(factorial(-12)); // 1
        System.out.println(factorial(5)); // 120
        System.out.println(factorial(100)); // 0 - factorial ограничен int, даже не long
        System.out.println(factorial(Integer.MAX_VALUE));
    }

    static int factorial(int n) { // должен вернуться -> передаём число
        if (n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    static int fact(int n) { // прямая рекурсия
        // если base case нет, но все сломается
        System.out.println(count);
        count++; //34344
        if (n <= 1) { // base case - для завершения рекурсии
            //       if (n >= 100) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }

    static void func1() { // косвенная рекурсия
        System.out.println("func1");
        func2();
    }

    static void func2() {
        System.out.println("func2");
        func3();
    }

    static void func3() {
        System.out.println("func3");
        func4();
    }

    static void func4() {
        System.out.println("func4");
        func1();
    }
}
