package de.telran.d221101.homework;

/*
реализовать класс MyLinkedList который будет представлять собой односвязный список.
Класс должен содеражть следующие методы: Class MyLinkedList
        pushToHead(int data) void,
        pushToTail(int data) void,
        pushToIndex(int index, int data) void
        removeFirst() void,
        removeLast() void,
        remove(int index) void
        get(int index) int
        size() int
        print() void

        также слежует реализваоть дополнительный класс Node c полями
        int data
        Node next
*/
public class MyLinkedList implements MyLL {

    private Node first;
    private Node last;
    private int size;

    @Override
    public void pushToHead(int data) {
        Node node = new Node(data, first, null);

        if (size == 0) {
            first = node;
        } else {
            first.prev = node;
        }
        first = node;
        size++;
    }

    @Override
    public void pushToTail(int data) {
        Node node = new Node(data, null, last);

        if (size == 0) { // ?почему не addFirst()
            first = node;
        } else {
            last.next = node;
        }
        last = node;
        size++;
    }

    @Override
    public void pushToIndex(int index, int data) {
        Node node = getNodeByIndex(index);
        node.data = data;
    }

    @Override
    public void remove(int index) {
        Node nodeToRemove = getNodeByIndex(index);
        removeNode(nodeToRemove);
    }

    @Override
    public int get(int index) {
        Node node = getNodeByIndex(index);
        return node.data;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void println() {
        System.out.println(this);
    }

    public String toString() {
        if (first == null) {
            return "";
        }

        Node node = first;

        StringBuilder sb = new StringBuilder();
/*
        while (node.next != null) { // но! не заходит последнее значение
            sb.append(node.value);
            node = node.next;
        }
*/
        while (true) {
            sb.append(node.data);
            sb.append(" ");
            node = node.next;
            if (node.equals(last)) {
                sb.append(node.data);
                break;
            }
        }

        return sb.toString();
    }

    private static class Node {
        int data;
        Node prev;
        Node next;

        public Node(int datas, Node next, Node prev) {
            this.data = data;
            this.prev = prev;
            this.next = next;
        }
    }

    private Node getNodeByIndex(int index) {
//        if (index < 0 || index >= size)
//            throw new Exception();

        Node res = first; // переход от 0 к следующему
        for (int i = 0; i < index; i++) {
            res = res.next;
        }
        return res;
    }

    private void removeNode(Node nodeToRemove) {
        Node left = nodeToRemove.prev;
        Node right = nodeToRemove.next;

        if (first == last) {
            first = null;
            last = null;
        }

        if (left == null) {
            first = right;
        } else {
            left.next = right;
        }

        if (right == null) {
            last = left;
        } else {
            right.prev = left;
        }

        nodeToRemove.prev = null;
        nodeToRemove.next = null;

        size--;
    }
}
