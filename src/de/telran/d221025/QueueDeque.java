package de.telran.d221025;

import java.util.*;

public class QueueDeque {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>(4); // расширяет очередь -
//        Queue<String> queue = new LinkedList<>(4);
// вводя на экран получим порядок добавления (первый вошёл, первый вышел) в Stack (последний вошёл, первым вышел)
        // add и offer похожие методы, но если очередь ограничена, то add выбросит exception
        queue.add("Il'yas");
        queue.add("Maria");
        queue.add("Ivan"); // выкинет ошибку, если очередб заполена
        queue.offer("Lidia"); // мы не сможем положить в очередь
        queue.offer("Maksim");
        queue.offer("Tim");

        System.out.println(queue);

        // remove  и poll похожие методы (результат один), но если элементов больше нет, то remove выбросит exception
        // removeElem(queue);
        pollElement(queue);
        fillQueue(queue);

        // element и peek, показывает кто в очереди первый, но element выбросит исключение
//        System.out.println(queue.element());
//        System.out.println(queue);
        System.out.println(queue.peek()); // будет ошибка, если 2 строки выше тоже использовать
        System.out.println(queue);

        queue.remove("Lidia"); // удалить объект
        System.out.println(queue);

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        // элементы хранятся и распечатываются не в том порядке, в котором клали, порядок определятся comparable
        priorityQueue.add(4);
        priorityQueue.add(8);
        priorityQueue.add(14);
        priorityQueue.add(0);
        priorityQueue.add(0);
        System.out.println(priorityQueue.remove()); // забираем в приоритетном порядке
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());

        // можем получить доступ как к первому, так и к последнему элементу
        Deque<Integer> deque = new ArrayDeque<>(); // очередь с функционалом стэка
        deque.add(5);
        deque.add(9);
        deque.addLast(10); // 10 в конце очереди
        deque.addFirst(17); // добавь элемент в начало, с обычной очередью так нельзя
        System.out.println(deque);

        System.out.println(deque.offer(12));
        System.out.println(deque.offerFirst(21));
        System.out.println(deque);
        System.out.println(deque.peek()); // взяли элемент из начала очереди
        System.out.println(deque.peekLast()); // из конца
        System.out.println(deque.pollLast()); // удали последний

        deque.getFirst(); // получить элемент по индексу нельзя
        deque.getLast(); // можно только первый и последний
    }

    static void removeElem(Queue queue) { // если вызовов больше, чем элементов в очереди будет ошибка
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
        queue.remove();
    }

    static void pollElement(Queue queue) { // вызовов больше, чем элементов в очереди
//        System.out.println(queue.poll());
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
    }

    static void fillQueue(Queue queue) { // заполняет очередь теми же данными
        queue.add("Il'yas");
        queue.add("Maria");
        queue.add("Ivan");
        queue.offer("Lidia");
        queue.offer("Maksim");
        queue.offer("Tim");
    }
}
