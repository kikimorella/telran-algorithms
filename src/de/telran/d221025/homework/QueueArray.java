package de.telran.d221025.homework;

/*
Queue — это линейная структура данных, которая следует принципу FIFO (First-In, First-Out). Это означает, что объект,
вставленный первым, будет первым, а затем объект, вставленный следующим.
основные операции:
Enqueue: Вставляет элемент в конец queue.
Dequeue: Удаляет объект из начала queue и возвращает его, тем самым уменьшая размер queue на единицу.
Peek: Возвращает объект в начале queue, не удаляя его.
IsEmpty: Проверяет, пуста queue или нет.
Size: Возвращает общее количество элементов, присутствующих в queue.
*/

public class QueueArray {

    private int[] arr; // массив для хранения элементов queue
    private int front; // front указывает на передний элемент в queue
    private int tail; // задняя часть указывает на последний элемент в queue
    private int capacity; // максимальная емкость queue
    private int count; // текущий размер queue


    QueueArray(int size){ // Конструктор для инициализации queue
        arr = new int[size];
        capacity = size;
        front = 0;
        tail = -1;
        count = 0;
    }

    public int remove() { // Функция для удаления переднего элемента из очереди
        if (isEmpty()) {// проверка на опустошение queue
         System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }

        int x = arr[front];

        System.out.println("Removing " + x);

        front = (front + 1) % capacity;
        count--;

        return x;
    }

    public void pushToEnd(int item) { // Функция для добавления элемента в конец queue
        if (isFull()) { // проверка на переполнение queue
            System.out.println("Overflow\nProgram Terminated");
            System.exit(-1);
        }

        System.out.println("Inserting " + item);

        tail = (tail + 1) % capacity;
        arr[tail] = item;
        count++;
    }

    public int peek() { // Функция для возврата первого элемента queue
        if (isEmpty()) {
            System.out.println("Underflow\nProgram Terminated");
            System.exit(-1);
        }
        return arr[front];
    }

    public int size() { // Функция для возврата размера queue
        return count;
    }

    public boolean isEmpty() { // Функция для проверки, пуста ли queue или нет
        return (size() == 0);
    }

    public boolean isFull() { // Функция для проверки того, заполнена ли queue или нет
        return (size() == capacity);
    }
}
