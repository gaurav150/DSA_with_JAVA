package com.practice.dsa;

public class TreeRecursionDemo {
    public void calculateRecursive(int n) {
        if (n > 0) {
            calculateRecursive(n-1);
            int k = n * n;
            System.out.println(k);
            calculateRecursive(n - 1);
        }
    }


    public static void main(String[] args) {
        TreeRecursionDemo r = new TreeRecursionDemo();
        r.calculateRecursive(4);

    }
}
