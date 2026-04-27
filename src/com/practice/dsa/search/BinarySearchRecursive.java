package com.practice.dsa.search;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BinarySearchRecursive {
    static Logger logger = Logger.getLogger(BinarySearchRecursive.class.getName());

    public int binarySearch(int[] arr, int key, int leftIndex, int rightIndex) {
        if (leftIndex > rightIndex) {
            return -1;
        } else {
            int middleIndex =  (leftIndex + rightIndex) / 2;
            if (key == arr[middleIndex]) {
                return middleIndex;
            } else if (key < arr[middleIndex]) {
                return binarySearch(arr, key, leftIndex, middleIndex-1);
            } else {
                return binarySearch(arr, key, middleIndex+1, rightIndex);
            }
        }
    }

    public static void main(String[] args) {
        logger.info("Binary Search Recursive Algorithm");
        BinarySearchRecursive bs = new BinarySearchRecursive();
        int result = bs.binarySearch(new int[]{4, 11, 18, 30, 54}, 36, 0, 4);
        logger.log(Level.INFO, "Search index for 36: {0} (-1 = not found)", result);
        result = bs.binarySearch(new int[]{4, 11, 18, 30, 54}, 30, 0, 4);
        logger.log(Level.INFO, "Search index for 30: {0} (-1 = not found)", result);
    }
}
