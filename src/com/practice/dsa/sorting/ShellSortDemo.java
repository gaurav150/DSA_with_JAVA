package com.practice.dsa.sorting;

public class ShellSortDemo {

    public void shellSort(int[] arr) {
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int temp = arr[i];
                int j = i - gap;
                while (j >= 0 && arr[j] > temp) {
                    arr[j + gap] = arr[j];
                    j -= gap;
                    arr[j + gap] = temp;
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
        ShellSortDemo sd = new ShellSortDemo();
        int[] arr = {7, 4, 10, 8, 3, 1};
        sd.display(arr);
        sd.shellSort(arr);
        sd.display(arr);
    }
}
