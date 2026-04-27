package com.practice.dsa.search;

import java.util.logging.Level;
import java.util.logging.Logger;

public class BinarySearchIterative {

    static Logger logger = Logger.getLogger(BinarySearchIterative.class.getName());
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
        logger.info("Binary Search Algorithm");
        BinarySearchIterative bs = new BinarySearchIterative();
        int result = bs.binarySearch(new int[]{4, 11, 18, 30, 54}, 5, 36);
        logger.log(Level.INFO, "Search index for 36: {0} (-1 = not found)", result);
        result = bs.binarySearch(new int[]{4, 11, 18, 30, 54}, 5, 30);
        logger.log(Level.INFO, "Search index for 30: {0} (-1 = not found)", result);
    }
}
