package de.telran.d221018;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExmpl3 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(12);
        list.add(12);
        list.add(24);
        list.add(48);
        list.add(36);
        list.add(48);
        list.add(48);
        list.add(60);
        System.out.println(list.toString()); // [12, 24, 48, 36, 48, 48, 60]

        list.add(4, 72); // подвинет [12, 24, 48, 36, 72, 48, 48, 60]

        System.out.println(list.toString());

        list.set(5, 86); // подменит [12, 24, 48, 36, 72, 86, 48, 60]

        System.out.println(list.toString());

        list.remove((Integer) 48); // удалит первое вхождение [12, 24, 36, 72, 86, 48, 60]

        System.out.println(list.toString());

        for (int i = 0; i < list.size(); i++) { // можем менять элементы
            System.out.println(list.get(i) + " ");
        }

        for (Integer i : list) {
            System.out.println(i + " ");
        }

        List<Integer> list2 = new ArrayList<>(12);
        for (int i = 0; i < list.size(); i++) {
            list2.add(list.get(i) * i);
        }
        System.out.println();

        list.addAll(list2);

        System.out.println("\n" + list.get(list.size() - 1));

        System.out.println(list.contains(300)); //false - проверка наличия элемента

        System.out.println(list.isEmpty()); //false - пустой или нет

        System.out.println(list.size()); // количество элементов в листе

        System.out.println(list.indexOf(300));

        list.clear(); // очищает лист
        System.out.println(list.toString()); //[]
    }
}
