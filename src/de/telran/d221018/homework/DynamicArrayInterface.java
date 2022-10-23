package de.telran.d221018.homework;

/**
 * This is the interface for the dynamic array.
 */
public interface DynamicArrayInterface {

    /**
     * Appends an item to the array
     *
     * @param newItem the item to be added
     */
    public void add(int newItem);

    /**
     * Add an item into the dynamic array, given a specified index. (check for validity of the index)
     *
     * @param newItem the item to be added
     * @param index
     */
    public void addAt(int index, int newItem);

    /**
     * Remove the given item (first occurrence) from the array
     * Move all items ahead of the one removed back one space
     *
     * @param toRemove item to be removed
     */
    public void remove(int toRemove);

    /**
     * Remove the item at the given index (check for validity of the index)
     * Move all items ahead of the one removed back one space
     *
     * @param index
     */
    public void removeAt(int index);

    /**
     * Gets the item at the given index (check for validity of the index)
     *
     * @param index
     * @return the item at the index, null otherwise
     */
    public int get(int index);

    /**
     * Swaps the value on the index position. (check for validity of the index)
     *
     * @param index   the position
     * @param newItem new value for the index position
     */
    public void set(int index, int newItem);

    /**
     * Resizes the array by doubling copying elements from old array to new
     * array with double the size and setting the old array to the copy.
     */
    public void doubleSize();

    /**
     * Reduces by half the array and copying elements from old array to new
     * array with half of the size and setting the old array to the copy.
     */
    public void shrinkSize();

    /**
     * Checks whether the array contains the given object
     *
     * @param data the object that we are finding
     * @return true if object is in the array, false otherwise
     */
    public boolean contains(int data);

    /**
     * Removes all of the items from the dynamic array
     */
    public void clear();

    /**
     * Returns whether the array is empty
     *
     * @return whether the array is empty
     */
    public boolean isEmpty();

    /**
     * Checks to see if the array is full by comparing, if all indexes of the array are filled with elements.
     *
     * @return true if the array is full, false otherwise
     */
    public boolean isFull();
}
/*
написать интерфейс Dynamic с методами:
-add(int) void
-addAt(index, data) void
-remove(int) void
-removeAt(index) void
-growSize() void
-shrinkSize() void
-set(index, data) void
-get(index) int
-clear() void
-contains(data) boolean
-isEmpty() boolean
*/
