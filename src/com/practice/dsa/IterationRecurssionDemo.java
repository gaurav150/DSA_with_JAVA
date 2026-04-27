package com.practice.dsa;
public class IterationRecurssionDemo {

    public void calculateIterative(int n) {
        while (n >0){
            int k = n * n;
            System.out.println(k);
            n--;
        }
    }

    public void calculateRecursive(int n) {
        if (n > 0) {
            int k = n * n;
            System.out.println(k);
            calculateRecursive(n - 1);
        }
    }

    public int calculateRecursiveSum(int n) {
        if(n == 0 ) {
            return 0;
        }
        return n+ calculateRecursiveSum(n-1);
    }

    public int calculateFactorial(int n) {
        if (n==0) {
            return 1;
        }
        return  n * calculateFactorial(n-1);
    }
    public static void main(String[] args) {
            IterationRecurssionDemo r = new IterationRecurssionDemo();
            r.calculateIterative(3);
            r.calculateRecursive(4);
        System.out.println(r.calculateRecursiveSum(5));
        System.out.println(r.calculateFactorial(5));

    }
}