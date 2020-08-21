package main.java.csc102.exams;

public class Exam1Q2 {
    private Character[] section;
    /*
    * R1: Write a recursive method that takes two arguments and returns the
    * value
    * of the first raised to the power of the second argument. i.e., mimic
    * the Math.pow(base, exp) method.
    * R2: Trace the method for 2 raise to the 4th power.
    *
    * C1: Must be implemented using recursion
     */
    public Exam1Q2() {
        System.out.println("Question 2\n");
        System.out.println(raiseToPower(2,4));
    }

    /*
    Working out the problem...
    So example is 2^4.
    2^4 is not recursive, it is one operation.
    So think about equivalent operations...
    2^4 = 2*2*2*2
    Try another example...
    6^3 = 6*6*6
    So in general, base^exp = { base * base * base ... * base }, ${exp} times
    So the operation will be perform base * base (exp - 1) times
    Recursively, this would be 1) tracker = exp 2) while exp--
    Base Case: exponent decreased to 1 (any x^1 = x), return base
     */
    public static int raiseToPower(int base, int exp) {
        if(exp == 1) {
            System.out.println("Returning: " + base + " (Base Case)");
            return base;
        }
        else {
            System.out.printf("<<return base * raiseToPower(%s, %s))>> -> ",
                    base,
                    exp-1);
            return base * (raiseToPower(base, --exp));

        }
    }
}
