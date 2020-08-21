package main.java.csc102.exams;

import java.util.ArrayList;
import java.util.Random;

public class Exam1Q1 {
    public static void main(String[] args) {
        //run program
        System.out.println(firstQuestion());
    }

    /*
    * Write a complete program that:
    * A) Creates an ArrayList that can hold integers.
    * B) Inserts 5 differnt integers into the ArrayList
    * C) Iterates over the numbers in the list, printing the square of each
    * value.
    * D) Changes the third number in the ArrayList to 9
    * E) Removes the last element of the ArrayList
     */
    public static String firstQuestion() {
        // Part A
        System.out.println("Creating ArrayList...");

        //Part B in helper method
        System.out.println("Initializing ArrayList of 5 random ints...");
        ArrayList<Integer> nums = getRandArrayList();
        System.out.println("Array initialized to " + nums);

        // Part C in helper method
        System.out.println("Printing squares of elements...");
        squareEachValue(nums);

        // Part D
        System.out.print("Setting third int (at index 2) to value 9...");
        nums.set(2, 9);
        System.out.println(nums);

        // Part E
        System.out.println("Removing last element...");
        nums.remove(nums.size() - 1);

        return nums.toString();

    }

    // Part B
    private static ArrayList<Integer> getRandArrayList() {
        Random random = new Random();
        ArrayList<Integer> tmp = new ArrayList<>();
        for(int i = 0; i < 5; i++) {
            // To allow negatives, add neg limit in generator and subtract after
            tmp.add(i, random.nextInt(100 + 100) - 100);
        }
        return tmp;
    }

    // Part C
    private static void squareEachValue(ArrayList<Integer> nums) {

        for(Integer i : nums) {
            System.out.printf("%-10d\t", (int) Math.pow(i, 2));
        }
    }

} // end Exam1Q1.java


