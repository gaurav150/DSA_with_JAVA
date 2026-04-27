package com.practice.dsa.sorting;

import java.util.Arrays;

public class InsertionSortAlgorithm {

    public int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int position = i - 1;
            while (position >= 0 && arr[position] > current) {
                arr[position + 1] = arr[position];
                position--;
            }
            arr[position + 1] = current;
        }
        return arr;
    }

    public void display(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        InsertionSortAlgorithm isa = new InsertionSortAlgorithm();
        int[] arr = {7, 4, 10, 8, 3, 1};
        isa.display(arr);
        System.out.println(Arrays.toString(isa.insertionSort(arr)));
        isa.display(arr);
    }
}
