package de.telran.d221025.homework;

public class QueueMain {
    public static void main(String[] args) {

        QueueArray queue = new QueueArray(4);

        queue.pushToEnd(11); // Inserting 11
        queue.pushToEnd(92); // Inserting 92
        queue.pushToEnd(53); // Inserting 53

        System.out.println("The front element is " + queue.peek()); // The front element is 11

        System.out.println("The queue size is " + queue.size()); // The queue size is 3

        queue.remove(); // Removing 11
        queue.remove(); // Removing 92

        System.out.println("The front element is " + queue.peek()); // The front element is 53

        if (queue.isEmpty()) { // The queue is not empty
            System.out.println("The queue is empty");
        } else {
            System.out.println("The queue is not empty");
        }
    }
}
