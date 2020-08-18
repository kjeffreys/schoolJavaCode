package com.review.arraylistvsarray;

/*
Creating a class Circle to construct an Array of Circle objects.
 */
public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public Circle(double r) {
        radius = r;
    }

    public double calcCircumference () {
        return 2 * 3.14159 * radius;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        nums[2] = 10;
        int sum = 0;

        for(int y=0; y<nums.length; ++y) {
            sum += nums[y];
        }
        System.out.println(sum);

        Circle[] globes = new Circle[3];
        globes[0] = new Circle(3.0);
        globes[1] = new Circle(2.0);
        globes[2] = new Circle(5.0);

        for(int x=0;x<globes.length;++x) {
            System.out.println(globes[x].calcCircumference());
        }
    }
}
