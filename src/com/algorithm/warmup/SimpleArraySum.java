package com.algorithm.warmup;

import java.util.Arrays;

public class SimpleArraySum {

    static int simpleArraySum(int[] ar) {
        int sum = 0;
        for (int a : ar) {
            sum += a;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] parameter;
        int result;
        parameter = new int[]{1, 2, 3, 4, 10, 11};
        result = simpleArraySum(parameter);
        System.out.println("Parameter: " + Arrays.toString(parameter));
        System.out.println("Result: " + result);

        System.out.println();

        parameter = new int[]{20, 30, 40, 50, 60};
        result = simpleArraySum(parameter);
        System.out.println("Parameter: " + Arrays.toString(parameter));
        System.out.println("Result: " + result);
    }
}
