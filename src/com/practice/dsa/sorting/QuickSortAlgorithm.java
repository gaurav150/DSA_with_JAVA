package com.practice.dsa.sorting;

public class QuickSortAlgorithm {

    public void quickSort(int[] arr, int lowIndex, int highIndex) {

        if (lowIndex < highIndex) {
            int partitionIndex = partition(arr, lowIndex, highIndex);
            quickSort(arr, lowIndex, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, highIndex);
        }
    }

    public int partition(int[] arr, int lowIndex, int highIndex) {
        int pivot = arr[lowIndex];
        int i = lowIndex + 1;
        int j = highIndex;
        do {
            while (i <= j && arr[i] <= pivot)
                i = i + 1;
            while (i <= j && arr[j] > pivot)
                j = j - 1;
            if (i <= j)
                swap(arr, i, j);
        } while (i < j);
        swap(arr, lowIndex, j);
        return j;
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    @SuppressWarnings("java:S106")
    public void display(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QuickSortAlgorithm qa = new QuickSortAlgorithm();
        int[] arr = {7, 4, 10, 8, 3, 1};
        qa.display(arr);
        qa.quickSort(arr, 0, arr.length - 1);
        qa.display(arr);
    }
}
