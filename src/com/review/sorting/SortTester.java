package com.review.sorting;

public class SortTester {
    public static void main(String[] args) {
        int[] unsorted = { 8,3,6,2,9,1,5 };

        InsertionSort.insertionSort(unsorted);


    }

    public static void printArray(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            System.out.print("\t" + i);
        }
        System.out.println();
        for(int i=0; i < nums.length; i++) {
            System.out.print("\t" + nums[i]);
        }
        System.out.println("\n");
    }
}
