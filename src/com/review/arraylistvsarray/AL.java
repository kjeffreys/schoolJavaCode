package com.review.arraylistvsarray;

import java.util.ArrayList;

public class AL {
    public static void main(String[] args) {
        ArrayList<Integer> vals = new ArrayList<>();

        vals.add(53);
        vals.add(101);
        vals.add(2001);
        vals.add(1,77);
        System.out.println(vals);

        int sum = 0;
        for(int x = 0; x < vals.size();++x)
        {
            sum = sum + vals.get(x);
        }
        System.out.println(sum);
    }
}
