package de.telran.d220920.HomeWork;

public class TowersOfHanoiStack {
    // Main function
    public static void main(String[] args) {
        int n = 3;

        TowersOfHanoiStack ob = new TowersOfHanoiStack();
        // Create three stacks (Source, destination, Auxiliary)
        Stack source = ob.initStack(n);
        Stack destination = ob.initStack(n);
        Stack auxiliary = ob.initStack(n);

        ob.iterativeTowerOfHanoi(n, source, auxiliary, destination);
    }

    // Stack Class
    class Stack {
        int capacity;
        int top;
        int array[];
    }

    // This function will create a new stack of the given capacity
    Stack initStack(int capacity) {
        Stack st = new Stack();
        st.capacity = capacity;
        st.top = -1;
        st.array = new int[capacity];
        return st;
    }

    // This function checks whether the stack is full or not
    boolean isFull(Stack st) {
        return (st.top == st.capacity - 1);
    }

    // This function checks whether the stack is empty or not
    boolean isEmpty(Stack st) {
        return (st.top == -1);
    }

    // This function adds this item to the stack.
    void push(Stack st, int item) {
        if (isFull(st)) {
            return;
        }

        st.array[++st.top] = item;
    }

    // This function removes the top of the stack.
    int pop(Stack st) {
        if (isEmpty(st))
            return Integer.MIN_VALUE;

        return st.array[st.top--];
    }

    // This function carries out the movement of the disk between two poles.
    void move(Stack src, Stack dest,
              char s, char d) {
        int disk1 = pop(src);
        int disk2 = pop(dest);
        // Is rod 1 is empty
        if (disk1 == Integer.MIN_VALUE) {
            push(src, disk2);
            printMove(d, s, disk2);
        }

        // if rod 2  is empty
        else if (disk2 == Integer.MIN_VALUE) {
            push(dest, disk1);
            printMove(s, d, disk1);
        }

        // If Disk 1 > Disk 2
        else if (disk1 > disk2) {
            push(src, disk1);
            push(src, disk2);
            printMove(d, s, disk2);
        }
        // If Disk 1 < Disk 2
        else {
            push(dest, disk2);
            push(dest, disk1);
            printMove(s, d, disk1);
        }
    }

    // This function will print the movement of disks
    void printMove(char from, char to, int disk) {
        System.out.println("Move the disk " + disk +
                " from " + from +
                " to " + to);
    }

    // Function to implement the algorithm
    void iterativeTowerOfHanoi(int n, Stack
            src, Stack aux, Stack dest) {
        int i, moves;
        char s = 'A', d = 'C', a = 'B';
        // If n is even then exchange the position of destination rod and auxiliary rod.
        if (n % 2 == 0) {
            char temp = d;
            d = a;
            a = temp;
        }
        moves = (int) (Math.pow(
                2, n) - 1);
        for (i = n; i >= 1; i--)
            push(src, i);
        for (i = 1; i <= moves; i++) {
            if (i % 3 == 1)
                move(src, dest, s, d);
            else if (i % 3 == 2)
                move(src, aux, s, a);
            else if (i % 3 == 0)
                move(aux, dest, a, d);
        }
    }
}
