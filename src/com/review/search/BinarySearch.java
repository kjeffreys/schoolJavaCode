package com.review.search;
import com.review.sorting.SortTester;

public class BinarySearch {

    public static int linearSearch(int[] nums, int searchVal) {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == searchVal) {
                return i;
            }
        }
        return -1;

    }

    public static int binarySearch(int[] nums, int searchVal) {
        int start = 0;
        int end = nums.length - 1;
        int middle;
        SortTester.printArray(nums);

        while(start<=end) {
            middle = (start+end) / 2;
            System.out.format("Start:%d End:%d Middle:%d\n",start,end,middle);
            if(searchVal>nums[middle]) {
                start = middle + 1;
            }
            else if(searchVal < nums[middle]) {
                end = middle - 1;
            }
            else {
                return middle;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] unsorted = {10,30,20,100,50,80};
        int[] sorted = {10,20,30,40,50,60,70,80};

        int place = 0;
        place = linearSearch(unsorted, 50);
        System.out.println("50 found at index " + place);
        place = binarySearch(sorted,70);
        System.out.println("70 found at index " + place);
    }
}
