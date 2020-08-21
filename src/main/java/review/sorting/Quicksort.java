package main.java.review.sorting;

public class Quicksort {

    private final int[] arr;

    public Quicksort(int[] arr) {
        this.arr = arr;
    }

    public void quickSort(int from, int to) {

        if (from >= to) {
            return;
        }
        int index = partition(from, to);
        quickSort(from, index);
        quickSort(index+1, to);

    }

    public int partition(int from, int to) {
        int pivot = arr[from];
        int i = from - 1;
        int j = to + 1;
        while(i<j) {
            i++;
            while(arr[i] < pivot) {
                i++;
            }
            j--;
            while(arr[j] > pivot) {
                j--;
            }
            if(i < j) {
                swap(i,j);
            }
        }
        return j;
    }

    public void swap(int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] unsorted = {5,6,3,9,1,8,4,2};
        Quicksort q = new Quicksort(unsorted);
        System.out.println("Unsorted:");
        SortTester.printArray(unsorted);
        q.quickSort(0, unsorted.length-1);
        System.out.println("Sorted:");
        SortTester.printArray(unsorted);
    }

}
