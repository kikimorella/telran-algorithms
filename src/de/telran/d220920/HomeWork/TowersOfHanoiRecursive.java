package de.telran.d220920.HomeWork;

/*
Задача заключается в следующем. Имеется три стержня — левый, средний и правый. На левом стержне находятся n дисков,
диаметры которых различны. Диски упорядочены по размеру диаметра, сверху лежит наименьший, снизу — наибольший.
Требуется перенести диски с левого стержня на правый, используя средний стержень как вспомогательный.

Головоломка имеет следующие два правила:
1. Вы не можете поместить больший диск на меньший диск.
2. За один раз можно перемещать только один диск.
*/

/**
 * A program to solve the towers of hanoi.
 */
public class TowersOfHanoiRecursive {
    // Рекурсивно:
    public static void main(String[] args) {
        towers(3, 'X', 'Y', 'Z');
        /*
        Disk 1 from X to Z
        Disk 2 from X to Y
        Disk 1 from Z to Y
        Disk 3 from X to Z
        Disk 1 from Y to X
        Disk 2 from Y to Z
        Disk 1 from X to Z
        */
        System.out.println("---");
        move(4, 1, 3); // if start<1 or end>3 => exception
        /*
        Move 1 from 1 to 2
        Move 2 from 1 to 3
        Move 1 from 2 to 3
        Move 3 from 1 to 2
        Move 1 from 3 to 1
        Move 2 from 3 to 2
        Move 1 from 1 to 2
        Move 4 from 1 to 3
        Move 1 from 2 to 3
        Move 2 from 2 to 1
        Move 1 from 3 to 1
        Move 3 from 2 to 3
        Move 1 from 1 to 2
        Move 2 from 1 to 3
        Move 1 from 2 to 3
        */
    }

    /**
     * The method for finding the solution to move n disks from left tower to right tower with usage of the middle tower
     *
     * @param n     how many disks
     * @param left  tower to move a disk from
     * @param right tower to move a disk to
     * @param mid   tower not involved
     */
    public static void towers(int n, char left, char mid, char right) {
        if (n == 1) { // Base case
            System.out.println("Disk 1 from " + left + " to " + right);
            return;
        } else {
            towers(n - 1, left, right, mid);
            System.out.println("Disk " + n + " from " + left + " to " + right);
            towers(n - 1, mid, left, right);
        }
    }

    /**
     * The method for finding the solution to move n disks from left tower to right tower with usage of the middle tower
     *
     * @param n     how many disks
     * @param start tower to move a disk from
     * @param end   tower to move a disk to
     */
    public static void move(int n, int start, int end) {
        if (n == 0) {
            return;
        }
        int middle = 6 - start - end;
        move(n - 1, start, middle);
        System.out.println("Move " + n + " from " + start + " to " + end);
        move(n - 1, middle, end);
    }
}
