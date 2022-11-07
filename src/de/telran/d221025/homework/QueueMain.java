package de.telran.d221025.homework;

public class QueueMain {
    public static void main (String[] args)
    {
        // создаем queue емкостью 5
        QueueArray q = new QueueArray(5);

        q.pushToEnd(1);
        q.pushToEnd(2);
        q.pushToEnd(3);

        System.out.println("The front element is " + q.peek());
        q.remove();
        System.out.println("The front element is " + q.peek());

        System.out.println("The queue size is " + q.size());

        q.remove();
        q.remove();

        if (q.isEmpty()) {
            System.out.println("The queue is empty");
        }
        else {
            System.out.println("The queue is not empty");
        }
    }
}
