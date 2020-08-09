package com.review.sorting;

public class InsertionSort {

    // Run with SortTester.java

    public static void insertionSort(int[] unsorted) {
        for(int sortIndex = 1; sortIndex < unsorted.length; ++sortIndex) {
            int nextVal = unsorted[sortIndex];
            int loopBack = sortIndex;
            System.out.print("Iteration " + sortIndex);
            System.out.println("\t Current Value: " + nextVal);
            System.out.println("\tStart:");
            SortTester.printArray(unsorted);

            while(loopBack > 0 && unsorted[loopBack-1] > nextVal) {
                unsorted[loopBack] = unsorted[loopBack-1];
                loopBack = loopBack - 1;
                SortTester.printArray(unsorted);
            }
            unsorted[loopBack] = nextVal;
            System.out.println("\tFinal:");
            SortTester.printArray(unsorted);
            System.out.println();
        }
        System.out.println("Sorted");
        SortTester.printArray(unsorted);
    }
}
