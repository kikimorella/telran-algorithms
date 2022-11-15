package de.telran.d221108;

//               20
//            /       \
//          7          35
//        /   \       /  \
//       4     9     31   40
//      /  \         /    /  \
//   null   6       28   38   52

import java.util.*;


// пример бинарного дерева с рекурсивным обходом в глубину
public class BinaryTree {
    public static void main(String[] params) {
        Tree root = // инициализация дерева
                new Tree(20, // корневой узел
                        new Tree(7, // левое поддерево
                                new Tree(4, null,
                                        new Tree(6)), new Tree(9)), // листья
                        new Tree(35, // правое поддерево
                                new Tree(31, // дочерний узел
                                        new Tree(28), null),
                                new Tree(40, new Tree(38), new Tree(52))));

        System.out.println("Сумма дерева: " + root.sumRecursive(root));
        // 20->7->4->null->6->null->9->null->35->31->28->null->40->38->null->52->null=270
        System.out.println("Сумма дерева: " + Tree.sumDeep(root));
        // 20->7->4->6->9->35->31->28->40->38->52=270
        System.out.println("Сумма дерева: " + Tree.sumWide(root));
        // 20+7+35+4+9+31+40+6+28+38+52=270

        // нет защиты от многопоточности (нет имплементации защиты, т.е. нужно отдельно пометить для защиты try-catch),
        // логично сделать synchronized или сортируем java.unit.concurrent.ConcurrentSkipListMap;
        Set<Integer> treeSet = new TreeSet<>(); // они сбалансированные
        Map<Integer, Integer> treeMap = new TreeMap<>(); // ключ и значение, т.е. сортировка по ключам, не по значениям
    }

    static class Tree {
        int value;
        Tree left;
        Tree right;

        public Tree(int value, Tree left, Tree right) { //для создания узла используют конструктор для дерева
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public Tree(int value) {
            this.value = value;
        } // конструктор для листа

        // пример бинарного дерева с рекурсивным обходом в глубину (считает сумму элементов)
        public int sumRecursive(Tree root) {
            int summ = root.value;

//            System.out.println(root.value);

            if (root.left != null) {
                summ += sumRecursive(root.left);
            }

            if (root.right != null) {
                summ += sumRecursive(root.right);
            }
            return summ;
        }

        // пример бинарного дерева с итеративным обходом в глубину (считает сумму элементов без рекурсии)
        public static int sumDeep(Tree root) {
            Stack<Tree> stack = new Stack<>();
            stack.push(root); //в стэк положили корень

            int summ = 0;

            while (!stack.isEmpty()) { // пока не пустой
                Tree node = stack.pop(); // достаём значение узла

//                System.out.println(node.value);// вытаскиваем значение

                summ = summ + node.value; // суммируем

                if (node.right != null) { // если правый потомок не 0, то мы в стэк складываем правый узел
                    stack.push(node.right);
                }

                if (node.left != null) { // последний складываем левый узел
                    stack.push(node.left);
                }
            }
            return summ;
        }

        // пример бинарного дерева с итеративным обходом в ширину (смотрим дерево по слоям)
        public static int sumWide(Tree root) {
            Queue<Tree> queue = new LinkedList<>(); // очередь
            queue.add(root);

            int summ = 0;

            while (!queue.isEmpty()) {
                Tree node = queue.remove();

//                System.out.println(node.value);

                summ = summ + node.value;

                if (node.left != null) {
                    queue.add(node.left);
                }

                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            return summ;
        }
    }
}
