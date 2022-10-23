package de.telran.d221018.homework;

/**
 * A class that represents a dynamic array object.
 */
public class DynamicArray implements DynamicArrayInterface {
    private int[] array;
    private int size;
    private int count;

    /**
     * Creates the initial array.
     */
    public DynamicArray(int[] array, int size, int count) {
        this.array = array;
        this.size = size;
        this.count = count;
    }

    /**
     * Creates the initial array.
     *
     * @param capacity custom size for the array
     */
    public DynamicArray(int capacity) {
        count = 0;
        array = new int[capacity];
    }

    @Override
    public void add(int newItem) { // if not int, then you need to add a check -> if (newItem != null)
        if (!isFull()) {
            array[count] = newItem;
            count++;
        } else {
            doubleSize();
            add(newItem);
        }
    }

    @Override
    public void addAt(int index, int newItem) {
        if (!isFull()) {
            int[] temp = new int[array.length + 1];

            for (int i = 0; i < index; i++) {
                temp[i] = array[i];
            }
            temp[index] = newItem;

            for (int i = index + 1; i < temp.length; i++) {
                temp[i] = array[i - 1];
            }

            count++;
            array = temp;

        } else {
            doubleSize();;
            addAt(index, newItem);
        }
    }

    @Override
    public void remove(int toRemove) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == toRemove) {
                removeAt(i);
            }
        }
    }

    @Override
    public void removeAt(int index) {
        int[] newSource = new int[array.length - 1];

        for (int i = 0; i < index; i++) {
            newSource[i] = array[i];
        }

        for (int i = index + 1; i < array.length; i++) {
            newSource[i - 1] = array[i];
        }

        count--;
        array = newSource;
    }

    @Override
    public int get(int index) {
        return array[index];
    }

    @Override
    public void set(int index, int newItem) {
        array[index] = newItem;
    }

    @Override
    public void doubleSize() {
        int[] newArray = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    public void growSize(int eltCount) {
        int[] newArray = new int[array.length + eltCount];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    @Override
    public void shrinkSize() {
        int[] newArray = new int[array.length / 2];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    @Override
    public boolean contains(int elt) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elt)
                return true;
        }
        return false;
    }

    @Override
    public void clear() {
        count = 0;
        int[] arrayCleared = new int[count];
        array = arrayCleared;
    }

    @Override
    public boolean isEmpty() {
        if (count == 0) {
            return true;
        }
        return false;
    }

    @Override
    public boolean isFull() {
        return count == array.length;
    }
}
/*
реализовать класс DynamicArray
с полями:
array[] int
count int
size int
конструкторы:
DynamicArray()
DynamicArray(int capacity)
*/
