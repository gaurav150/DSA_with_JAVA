package com.practice.dsa.sorting;

public class SelectionSortAlgorithm {

    public void selectionSorting(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++){
            int position = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[position] > arr[j]) {
                    position = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[position];
            arr[position] = temp;
        }
    }

    public void display(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        SelectionSortAlgorithm ss = new SelectionSortAlgorithm();
        int[] arr = {7, 4, 10, 8, 3, 1};
        ss.display(arr);
        ss.selectionSorting(arr);
        ss.display(arr);
    }
}
