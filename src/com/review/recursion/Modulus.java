package com.review.recursion;

import java.util.Scanner;

public class Modulus {

    // NOTE: To see the horrible performance of recursion, try 600000 / 3
    // Gets: "Exception in thread "main" java.lang.StackOverflowError"
    //          due to stack frame added per recursive call.
    public static int mod(int dividend, int mod) {
        if(dividend < mod) {
            return dividend;
        }
        else {
            return mod(dividend-mod, mod);
        }

    }

    public static void main(String[] args) {
        int dividend, modNum;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter Dividend:\n");
        dividend = kb.nextInt();
        System.out.print("Enter Mod:\n");
        modNum = kb.nextInt();
        System.out.println(dividend + "%" + modNum + "=" + mod(dividend,
                modNum));
    }

}
