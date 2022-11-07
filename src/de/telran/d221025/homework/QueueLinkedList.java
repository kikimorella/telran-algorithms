package de.telran.d221025.homework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();

        queue.add("Aa");     // Вставляем `A` в queue
        queue.add("Bb");
        queue.add("Cc");
        queue.add("Dd");

        // Печатает начало queue
        System.out.println("The front element is " + queue.peek()); // The front element is Aa

        queue.remove(); // удаление переднего элемента (`Aa`)
        queue.remove(); // удаление переднего элемента (`Bb`)

        System.out.println("The front element is " + queue.peek()); // The front element is Cc

        // Возвращает общее количество элементов в queue
        System.out.println("The queue size is " + queue.size()); // The queue size is 2

        if (queue.isEmpty()) { // The queue is not empty
            System.out.println("The queue is empty");
        }
        else {
            System.out.println("The queue is not empty");
        }
    }
}
