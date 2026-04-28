package com.practice.dsa.sorting;

public class BubbleSortDemo {

    public void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void display(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BubbleSortDemo bs = new BubbleSortDemo();
        int[] arr = {7, 4, 10, 8, 3, 1};
        bs.display(arr);
        bs.bubbleSort(arr);
        bs.display(arr);
    }
}
