package com.practice.dsa;

public class LinearSearchAlgorithm {

    public int linearSearch(int[] arr, int n, int key ) {
        int index = 0;
        while(index < n) {
            if(key == arr[index]) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public static void main(String[] args) {
        LinearSearchAlgorithm ls = new LinearSearchAlgorithm();
        int[] arr = {2,4,6,8,10,12,14,16};
        int length = arr.length;
        int searchKey = 12;
        int result = ls.linearSearch(arr, length, searchKey);
        System.out.println("Element found at index: "+ result);
    }
}
