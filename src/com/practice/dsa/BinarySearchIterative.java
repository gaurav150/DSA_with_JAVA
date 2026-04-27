package com.practice.dsa;

public class BinarySearchIterative {

    public int binarySearch(int[] arr, int n, int key) {
        int leftIndex = 0;
        int rightIndex = n-1;
        while (leftIndex <= rightIndex) {
            int middleIndex = (leftIndex + rightIndex) / 2;
            if (key == arr[middleIndex]) {
                return middleIndex;
            } else if (key < arr[middleIndex]) {
                rightIndex = middleIndex - 1;
            } else if (key > arr[middleIndex]) {
                leftIndex = middleIndex + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("Binary Search Algorithm");
        BinarySearchIterative bs = new BinarySearchIterative();
        int result = bs.binarySearch(new int[]{4, 11, 18, 30, 54},5,36);
        System.out.println("Element found at index: " + result);
        result = bs.binarySearch(new int[]{4, 11, 18, 30, 54}, 5, 30);
        System.out.println("Element found at index for new key: " + result);
    }
}
