package de.telran.d221018;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExmpl2 {
    public static void main(String[] args) {
        // так лучше не делать
//        ArrayList<Integer> arrayList = new ArrayList<>();
//        List<Integer> list = new ArrayList<>();
//        list = new LinkedList<>();
        List<Integer> list = new ArrayList<>(); // инициализирован пустой ArrayList
        list.add(12);
        list.add(101);
        System.out.println(list.get(1)); // 101
//        list.add('c'); // будет ошибка, но сработает если <Integer> -> <Object>
        // лист не может использовать примитив класс данных, но может классы обёртки, т.е. ссылочные типы данных

        ArrayList<Integer> tempList = new ArrayList<>();
        tempList.add(5);
        tempList.add(6);

        int[] nums = {1, 23, 4};

        //List<Integer> list0 = new ArrayList<>(nums); // не сработает, т.к. int не коллекция
        List<Integer> list1 = new ArrayList<>(tempList); // мы вложили в ArrayList коллекцию. НО! тип должен совпадать
        List list2 = new ArrayList<>(12); // дурной тон, не указан тип данных
        list1.add(12);
        list1.add(0);
        list2.add("sfs"); // будет ошибка, если List <Integer> list2
        System.out.println(list1.toString()); // [5,6,12,0]
        System.out.println(list2.toString()); // [0, 12]
        boolean bool = list2.get(0) instanceof Integer ? true : false; // true, т.к. ArrayList<Integer> tempList

        // многопоточное программирование
        // строители работают параллельно, но никто из них не знает, как будет выглядеть дом.
        // они должны 1 ставит крышу, 2 - стены, 3 - фундамент, но в листе они могут все залить фундамент
        // Vector<Integer> vector = new Vector<>(); // а вот это многопоточная система, лучше использовать вместо листа
        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            method1();
        });
        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            method2();
        });
        Thread t3 = new Thread(() -> {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            method3();
        });
        t1.start();
        t2.start();
        t3.start();
    }

    // многопоточное программирование - https://dataart.team/ru/articles/mnogopotochnost-v-java-kurs-iz-shesti-lekfii
    static void method1() {
        System.out.println("method 1");
    }

    static void method2() {
        System.out.println("method 2");
    }

    static void method3() {
        System.out.println("method 3");
    }

    static void method4() {
        System.out.println("method 4");
    }
}
