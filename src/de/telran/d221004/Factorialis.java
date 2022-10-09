package de.telran.d221004;

/*Факториа́л — функция, определённая на множестве неотрицательных целых чисел. Название происходит от лат.
factorialis — действующий, производящий, умножающий; обозначается n!, произносится эн факториа́л. Факториал натурального
числа n определяется как произведение всех натуральных чисел от 1 до n включительно:*/
public class Factorialis {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(Math.pow(2, x));
        System.out.println(fact(5));
    }

    static long fact(int n) {
        long res = 1;
        while (n >1) {
            res *= n;
            n--;
        }
        return res;
    }
}
