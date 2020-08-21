package main.java.review.sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int[] unsorted = { 12, 5, 2, 27, 8 };

        System.out.println("Unsorted");
        printArray(unsorted);

        for(int sortIndex=0; sortIndex < unsorted.length; ++sortIndex) {
            int minIndex = sortIndex;

            for(int minSeek =sortIndex+1; minSeek<unsorted.length;++minSeek) {
                //find minIndex
                if(unsorted[minSeek] < unsorted[minIndex]) {
                    minIndex = minSeek;
                }
            }

            int temp = unsorted[sortIndex];
            unsorted[sortIndex] = unsorted[minIndex];
            unsorted[minIndex] = temp;

            System.out.println("Swap index " + sortIndex + " with index " + minIndex);
            System.out.println("After iteration " + sortIndex);
            printArray(unsorted);
        }
        System.out.println("Sorted:");
        printArray(unsorted);
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
