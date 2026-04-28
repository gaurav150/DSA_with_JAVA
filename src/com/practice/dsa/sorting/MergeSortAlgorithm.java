package com.practice.dsa.sorting;

public class MergeSortAlgorithm {

    public void mergeSort(int[] arr, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int middleIndex = (leftIndex + rightIndex) / 2;
            mergeSort(arr, leftIndex, middleIndex);
            mergeSort(arr, middleIndex + 1, rightIndex);
            merge(arr, leftIndex, middleIndex, rightIndex);
        }
    }

    public void merge(int[] arr, int leftIndex, int middleIndex, int rightIndex) {
        int n = rightIndex - leftIndex + 1;
        int[] temp = new int[n];
        int i = leftIndex;
        int j = middleIndex + 1;
        int t = 0;
        while (i <= middleIndex && j <= rightIndex) {
            if (arr[i] <= arr[j]) {
                temp[t++] = arr[i++];
            } else {
                temp[t++] = arr[j++];
            }
        }
        while (i <= middleIndex) {
            temp[t++] = arr[i++];
        }
        while (j <= rightIndex) {
            temp[t++] = arr[j++];
        }
        System.arraycopy(temp, 0, arr, leftIndex, n);
    }
    @SuppressWarnings("java:S106")
    public void display(int[] arr, int n) {
        for(int i=0;i<n;i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    @SuppressWarnings("java:S106")
    public static void main(String[] args) {
        MergeSortAlgorithm s = new MergeSortAlgorithm();
        int[] a = {3, 5, 8, 9, 6, 2};
        System.out.print("Original Array: ");
        s.display(a, 6);
        s.mergeSort(a, 0, a.length-1);
        System.out.print("Sorted Array: ");
        s.display(a, 6);
    }

}
