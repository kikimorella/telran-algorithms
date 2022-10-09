package de.telran.d220920.HomeWork;

public class Hanoi {

    public static void main(String[] args) {
        int n = 5;
        hanoi(n,'A','B','C');
    }

    static void hanoi(int n,char start,char mid,char end) {
        if(n==1) {
            System.out.println(n +" Из "+start + " K " + end);
            return;
        }
        hanoi(n-1,start,end,mid);
        System.out.println(n +" Из "+start + " K " + end);
        hanoi(n-1,mid,start,end);

    }
}
