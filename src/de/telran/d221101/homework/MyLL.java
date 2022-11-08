package de.telran.d221101.homework;

/**
 * The insterface describes a data structure called List. It is a ordered data structure.
 */
public interface MyLL {

    /**
     * Add an element to the end of the list
     *
     * @param data to append
     */
    public void pushToHead(int data);

    /**
     * Add an element to the end of the list
     *
     * @param data to append
     */
    public void pushToTail(int data); // добавить в конец элемент

    /**
     * The method swaps the value on the index position
     *
     * @param index the position
     * @param data  a new value for the index position
     * @throws Exception if index < 0 or >= size
     */
    public void pushToIndex(int index, int data); // устанавливает элемент по индексу

    /**
     * removes the value by its position. The elements which are after the index move to the left by 1 position
     *
     * @param index of the value to remove
     * @return the value being removed
     * @throws Exception if index < 0 or >= size
     */
    public void remove(int index); // вырезать элемент по индексу

    /**
     * The method gets the value on the index position
     *
     * @param index the position, whose value to be returned
     * @return the value by its position
     * @throws Exception if index < 0 or >= size
     */
    public int get(int index); // достаёт элемент по индексу

    /**
     * @return The number of elements in the list
     */
    public int size(); // возвращает длину

    /**
     * prints the element out to the console (one by one)
     */
    public void println();
}
