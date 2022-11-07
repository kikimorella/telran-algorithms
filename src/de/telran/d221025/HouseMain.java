package de.telran.d221025;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class HouseMain {

    public static void main(String[] args) {
//        House h1 = new House(1_000_000, 123.45, "DE8989", "RiessStr., 18");
//        House h2 = new House(99_999, 12, "FR465", "FrenchStr.19");
//
//        System.out.println(h1.compareTo(h2)); //-233

        Queue<House> queue = new PriorityQueue<>();
        House cheapH = new House();
        cheapH.setPrice(1_000);

        House middlePriceH = new House();
        middlePriceH.setPrice(20_000);

        House expensiveH = new House();
        expensiveH.setPrice(300_000);

        House veryExpensiveH = new House();
        veryExpensiveH.setPrice(4_000_000);

        queue.add(cheapH);
        queue.add(middlePriceH);
        queue.add(expensiveH);
        queue.add(veryExpensiveH);

        System.out.println(queue); // [House{price=1000}, House{price=20000}, House{price=300000}, House{price=4000000}]

        System.out.println(queue.remove(expensiveH));
        System.out.println(queue);

        System.out.println(queue.poll());
        System.out.println(queue);

        for (House h : queue) { //очередь не меняется и элементы не изменяются
            System.out.println(h);
        }

        // преобразование очереди в массив
        LinkedList<House> tempQueue = new LinkedList<>();
        tempQueue.addAll(queue);
        for (int i = 0; i < queue.size(); i++) {
            System.out.println(tempQueue.get(i));
        }
    }
}
