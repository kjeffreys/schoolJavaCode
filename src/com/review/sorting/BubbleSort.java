package com.review.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {10,2,8,4,7,5,1,3};
        printArray(nums);

        //The easy way -- Do this at contests :D
        //Arrays.sort(nums);

        //Bubble sort
        for(int x = 0; x < nums.length; x++) {
            System.out.println("X is " + x);
            for(int y = 0; y < nums.length - 1; ++y) {
                if(nums[y] > nums[y+1]) {
                    int temp = nums[y];
                    nums[y] = nums[y+1];
                    nums[y+1] = temp;
                }
                System.out.print(y + "    ");
                printArray(nums);
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void printArray(int[] a) {
        for(int x =0; x <a.length; x++) {
            System.out.print(a[x] + " ");
        }
        System.out.println();
    }
}
